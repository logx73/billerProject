import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { PattiComponent } from './components/patti/patti.component';
import { FarmerListComponent } from './components/farmer-list/farmer-list.component';
import { CreateFarmerComponent } from './components/create-farmer/create-farmer.component';

const routes: Routes = [
  {path : '', component: FarmerListComponent},
  {path : 'patti', component: PattiComponent},
  {path : 'patti/:id', component: PattiComponent},
  {path : 'create-farmer', component: CreateFarmerComponent}
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
