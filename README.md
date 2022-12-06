# <strong style="color:blue; opacity: 0.80">AP 4-Securit-des-micro-services-avec-Keycloak</strong>:mortar_board::computer: 
# <span style="color:green "> 1.Présentation de l'activité pratique</span>
 * <strong style="color:dark">Partie 1 :100: 
    1. Télécharger Keycloak 19
    2. Démarrer Keycloak
    3. Créer un compte Admin
    4. Créer une Realm
    5. Créer un client à sécuriser
    6. Créer des utilisateurs
    7. Créer des rôles
    8. Affecter les rôles aux utilisateurs
    9. Avec PostMan :
        - Tester l'authentification avec le mot de passe
        - Analyser les contenus des deux JWT Access Token et Refresh Token
        - Tester l'authentification avec le Refresh Token
        - Tester l'authentification avec Client ID et Client Secret
        - Changer les paramètres des Tokens Access Token et Refresh Token

* Partie  2 :100: 
       -Sécuriser L'architecture Micro services Du projet Customer-service, Inventory-service et Order-service
</span>

# <span style="color:green "> 2.Architecture de l'activité pratique</span>

![](https://i.imgur.com/6jajo4k.png)
___

![](https://i.imgur.com/9G0xYcB.png)

# <span style="color:green">3.Les Technologies utilisées</span>
 #### <span style="color:#0036ad"> 1.Kycloak</span>
 * <strong style="color:dark">* <strong style="color:dark">KeyCloak est un produit logiciel open source pour permettre une connexion unique avec la gestion de l'identité et de l'accès destiné aux applications et services modernes. Depuis mars 2018, ce projet communautaire Wildfly est sous la gestion de Red Hat qui l'utilise comme projet en amont pour leur produit RH-SSO.

*voir également à propos* [Keycloak](https://www.keycloak.org/):link: 

    
# <span style="color:green">4.Le dépot des micro-services utilisés</span>
    
## **[Micro-Services(Customer-service, Inventory-service et Order-service)](https://github.com/KhaoulaElmajni/AP-micro-service-with-centralized-configuration-and-consul-discovery-service)**
    


# <span style="color:green">5 .La sécurité des micro-servces avec Keycloak</span>   
<span style="color:orange"> **Partie 1 :**</span> 
###  1. Télécharger Keycloak 20.0.1
![](https://i.imgur.com/Vq9GJqs.png)
    
    
###  2. Démarrer Keycloak
* J'ai crée une image dans Docker pour démarrer le Keycloak:
    la commande:
    `docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:20.0.1 start-dev`
    
![](https://i.imgur.com/1hqeErJ.png)

![](https://i.imgur.com/5mpcYEX.png)

###  3. Créer un compte Admin
![](https://i.imgur.com/SevGvE6.png)

###  4. Créer une Realm
![](https://i.imgur.com/veZ5TSh.png)
    
###  5. Créer un client à sécuriser
![](https://i.imgur.com/vO6Nwfp.png)
    
![](https://i.imgur.com/zTzP8Xj.png)

![](https://i.imgur.com/UzQdHcA.png)

![](https://i.imgur.com/xHkBiTp.png)
    
###  6. Créer des utilisateurs


|        | USER1 | USER2 | USER3 |
|--------| -------- | -------- | -------- |
| Création | ![](https://i.imgur.com/cpnU0GA.png)|![](https://i.imgur.com/6KwhxbM.png)|![](https://i.imgur.com/GL7JLzI.png)|
| Password |![](https://i.imgur.com/e0efA9J.png)|![](https://i.imgur.com/gZfOjXV.png)|![](https://i.imgur.com/fw4HAC3.png)

>La liste des utilisateurs crées:

![](https://i.imgur.com/5tWurJZ.png)

    
###  7. Créer des rôles
    
![](https://i.imgur.com/FeRNMnS.png)


###  8. Affecter les rôles aux utilisateurs
    
###  9. Avec PostMan :
    
> * Tester l'authentification avec le mot de passe

> * Analyser les contenus des deux JWT Access Token et Refresh Token
    
> * Tester l'authentification avec le Refresh Token
    
> * Tester l'authentification avec Client ID et Client Secret
    

> * Changer les paramètres des Tokens Access Token et Refresh Token
    
    
___
    
* <strong style="color: dark ; opacity: 0.80">Enfin nous tenons à remercier le seul et unique, notre professeur Mr YOUSFI Mohamed *Docteur & professeur à l'ENSET MEDIA* pour son soutien et son encouragement envers nous, aussi pour nous avoir donné cette opportunité d'améliorer nos compétences et de connaître les nouvelles technologies comme celles qui nous avons travaillé.

*voir également à propos* Mr [YOUSSFI Mohamed](https://www.linkedin.com/in/mohamed-youssfi-3ab0811b/)
</strong>

> Created by :[name=ELMAJNI KHAOULA]
[time=Mon,2022,12,06][color=#EF0101]
>*voir également à propos de moi* [ELMAJNI Khaoula](https://www.linkedin.com/in/khaoula-elmajni/)