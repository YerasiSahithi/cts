import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UpdateIPOComponent } from './update-ipo/update-ipo.component';
import { ImportDataComponent } from './import-data/import-data.component';
import { ManageCompanyComponent } from './manage-company/manage-company.component';
import { ManageExchangeComponent } from './manage-exchange/manage-exchange.component';


const routes: Routes = [
{path:'update-ipo',component:UpdateIPOComponent },   
{path:'import-data',component:ImportDataComponent},
{path:'manage-company',component:ManageCompanyComponent},
{path:'manage-exchange',component:ManageExchangeComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
