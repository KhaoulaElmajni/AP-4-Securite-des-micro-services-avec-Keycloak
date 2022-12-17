package me.elmajni.orderservice.web;

import me.elmajni.orderservice.OrderServiceApplication;
import me.elmajni.orderservice.entities.Order;
import me.elmajni.orderservice.models.Customer;
import me.elmajni.orderservice.models.Product;
import me.elmajni.orderservice.repositories.OrderRepository;
import me.elmajni.orderservice.repositories.ProductItemRepository;
import me.elmajni.orderservice.services.CustomerRestClientService;
import me.elmajni.orderservice.services.InventoryRestClientService;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
//@RequestMapping("/api")
@CrossOrigin("*")
public class OrderRestController {
    private static final Logger LOG = Logger.getLogger(OrderServiceApplication.class.getName());

    private OrderRepository orderRepository;
    private ProductItemRepository productItemRepository;
    private CustomerRestClientService customerRestClientService;
    private InventoryRestClientService inventoryRestClientService;

    public OrderRestController(OrderRepository orderRepository,
                               ProductItemRepository productItemRepository,
                               CustomerRestClientService customerRestClientService,
                               InventoryRestClientService inventoryRestClientService) {
        this.orderRepository = orderRepository;
        this.productItemRepository = productItemRepository;
        this.customerRestClientService = customerRestClientService;
        this.inventoryRestClientService = inventoryRestClientService;
    }

    @GetMapping("/fullOrder/{id}")
    public Order getOrder(@PathVariable Long id){
        LOG.log(Level.INFO, "Index API is calling");
        Order order = orderRepository.findById(id).get();
        Customer customer = customerRestClientService.customerById(order.getCustomerId());
        order.setCustomer(customer);
        order.getProductItems().forEach(pi->{
            Product product = inventoryRestClientService.productById(pi.getProductId());
            pi.setProduct(product);
        });
        return order;
    }


    @GetMapping("/jwt")
    @ResponseBody
    public Map<String,String> map(HttpServletRequest request){
        KeycloakAuthenticationToken token = (KeycloakAuthenticationToken) request.getUserPrincipal();   //=> il permet de récupérer le token de l'utilisateur
        KeycloakPrincipal principal = (KeycloakPrincipal) token.getPrincipal(); //=> il permet de récupérer le principal de l'utilisateur
        KeycloakSecurityContext session = principal.getKeycloakSecurityContext();   //=> il permet de récupérer la session de l'utilisateur
        //le contexte de sécurité de keycloak => les informations de l'utilisateur authentifié

        Map<String,String>map = new HashMap<>();
        map.put("access_token",session.getTokenString());
        return map;
    }
}
