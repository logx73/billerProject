import { Component, OnInit } from '@angular/core';
import { Goods } from 'src/app/common/goods';
import { PattiService } from 'src/app/services/patti.service';
import { FormGroup, FormControl, FormBuilder, FormArray} from '@angular/forms'

@Component({
  selector: 'app-patti',
  templateUrl: './patti.component.html',
  styleUrls: ['./patti.component.css']
})
export class PattiComponent implements OnInit {
  form!: FormGroup;

  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
    this.form = this.fb.group({
      formArray: this.fb.array([this.createFormGroup()])
    });
  }

  get formArray(): FormArray {
    return this.form.get('formArray') as FormArray;
  }

  createFormGroup(): FormGroup {
    return this.fb.group({
      price: [null],
      weight: [null],
      amount: [null],
      advanceAmount: [null],
      checkNumber: [null],
      purchaseDate: [null]
    });
  }

  addFormGroup(): void {
    this.formArray.push(this.createFormGroup());
  }
  
  submitForm(): void {
      const formData = this.form.value.formArray.map((item:any)=>{
          return new Goods(item.price,item.weight,item.amount,item.advanceAmount,item.checkNumber,item.purchaseDate);
      });
      console.log(formData);
      this.saveDataToBackend(formData);
  }

  saveDataToBackend(formData:Goods[]){

  }
  // goodArr :Goods = {} as Goods;
  // loginForm: FormGroup;
  

  // constructor(private pattiService:PattiService, private fb:FormBuilder) { 
  //   this.loginForm = this.fb.group({
  //     goodsAr: this.fb.array([]),
  //   });
  // }

  // goodsAr(): FormArray{
  //   return this.loginForm.get('goodsAr') as FormArray;
  // }

  // newGood(): FormGroup{
  //   return this.fb.group({
  //     price: '',
  //     weight: '',
  //     amount: '',
  //     advanceAmount: '',
  //     checkNumber: '',
  //     purchaseDate: ''
  //   })
  // }

  // addQuantity(){
  //   this.goodsAr().push(this.newGood());
  // }

  // removeQuantity(i:number){
  //   this.goodsAr().removeAt(i);
  // }

  // onSubmit(){
  //   console.log(this.loginForm.value);
  // }

  // ngOnInit(): void {
  // }

  // calculate(): any{
  //     this.goodArr.amount = this.goodArr.price * this.goodArr.weight;
  //     console.log(this.goodArr.amount);
  //     return this.goodArr.amount;
  // }

  // savePatti() {
  //           this.pattiService.savePatti(this.goodArr).subscribe();   
  // }

}
