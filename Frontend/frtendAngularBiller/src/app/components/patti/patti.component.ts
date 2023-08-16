import { Component, OnInit } from '@angular/core';
import { Goods } from 'src/app/common/goods';

@Component({
  selector: 'app-patti',
  templateUrl: './patti.component.html',
  styleUrls: ['./patti.component.css']
})
export class PattiComponent implements OnInit {
  goodArr :Goods = {} as Goods;

  constructor() { }

  ngOnInit(): void {
  }

  calculate(): any{
      this.goodArr.amount = this.goodArr.price * this.goodArr.weight;
      console.log(this.goodArr.amount);
      return this.goodArr.amount;
  }

}
