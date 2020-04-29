import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { ProductService } from '../product.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})

export class AddProductComponent implements OnInit {

  message:string;

  mySubscription:Subscription;

  constructor(private productService:ProductService) { }
  postProduct(form:NgForm){
    this.productService.postData(form.value).subscribe(response => {
      console.log(response);
      form.reset();
      if(!response.error) {
        this.message = "Product added successfully";
      }
    }, error => {
      console.log(error);
    });
  }
  ngOnInit() {
  }

}