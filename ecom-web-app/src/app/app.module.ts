import {APP_INITIALIZER, NgModule} from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductsComponent } from './products/products.component';
import { CustomersComponent } from './customers/customers.component';
import { OrdersComponent } from './orders/orders.component';
import { OrderDetailsComponent } from './order-details/order-details.component';
import {HttpClientModule} from "@angular/common/http";
import {KeycloakAngularModule, KeycloakService} from "keycloak-angular";
import {NavbarComponent} from "./navbar/navbar.component";


export function kcFactory(kcService : KeycloakService){
  return ()=>{
    kcService.init({
      config : {
        realm :"wallet-realm",
        clientId : "wallet-client",
        url : "http://localhost:8080"
      },
      initOptions : {
        onLoad : "check-sso",
        checkLoginIframe : true
      }
    })
  }
}



@NgModule({
  declarations: [
    AppComponent,
    ProductsComponent,
    CustomersComponent,
    OrdersComponent,
    OrderDetailsComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    KeycloakAngularModule
  ],
  providers: [
    {provide : APP_INITIALIZER, deps : [KeycloakService],useFactory : kcFactory, multi : true}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
