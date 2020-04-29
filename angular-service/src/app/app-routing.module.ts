import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddProductComponent } from './add-product/add-product.component';
import { EditProductComponent } from './edit-product/edit-product.component';
import {  ProductComponent } from './product/product.component';


const routes: Routes = [
  {path:'products',component:ProductComponent},
  {path:'add-products',component:AddProductComponent},
  {path:'edit-products',component:EditProductComponent},
  {path:'',redirectTo:'/products',pathMatch:'full'}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
