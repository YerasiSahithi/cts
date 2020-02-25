import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import {RouterModule} from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { ImportDataComponent } from './import-data/import-data.component';
import { ManageCompanyComponent } from './manage-company/manage-company.component';
import { ManageExchangeComponent } from './manage-exchange/manage-exchange.component';
import { UpdateIPOComponent } from './update-ipo/update-ipo.component';
import { HttpClientModule } from '@angular/common/http';  
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { UserListComponent } from './userlist/userlist.component';
import { CompanylistComponent } from './companylist/companylist.component';
import { IpoListComponent } from './ipo-list/ipo-list.component';
import { ExchangelistComponent } from './exchangelist/exchangelist.component';
import { SectorComponent } from './sector/sector.component';  

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    NavBarComponent,
    HomeComponent,
    AdminComponent,
    UserComponent,
    ImportDataComponent,
    ManageCompanyComponent,
    ManageExchangeComponent,
    UpdateIPOComponent,
    UserListComponent,
    CompanylistComponent,
    IpoListComponent,
    ExchangelistComponent,
    SectorComponent,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule, 
    FormsModule,  
    ReactiveFormsModule,  
 
    RouterModule.forRoot([
      {
        path:'',
        component:HomeComponent
      },

      {path:'home',component:HomeComponent},

        {path:'login',component:LoginComponent},
        {path:'signup',component:SignupComponent},
   
      
    ]),
    
    RouterModule.forRoot([
      {
        path:'admin',
        component:AdminComponent
      }
    ]),
    RouterModule.forRoot([
      {
        path:'user',
        component:UserComponent
      }
    ]),
    RouterModule.forRoot([
      {
        path:'import-data',
        component:ImportDataComponent
      }
    ]),
    RouterModule.forRoot([
      {
        path:'manage-company',
        component:ManageCompanyComponent

      }
    ]),
    RouterModule.forRoot([
      {
        path:'userlist',
        component:UserListComponent

      }
    ]),
    RouterModule.forRoot([
      {
        path:'companylist',
        component:CompanylistComponent,

      }
    ]),
    RouterModule.forRoot([
      {
        path:'update-ipo',
        component:UpdateIPOComponent

      }
    ]),
    RouterModule.forRoot([
      {
        path:'manage-exchange',
        component:ManageExchangeComponent


      }
    ]),
    RouterModule.forRoot([
      {
        path:'ipo-list',
        component:IpoListComponent


      }
    ]),
    RouterModule.forRoot([
      {
        path:'exchangelist',
        component:ExchangelistComponent


      }
    ])




  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
