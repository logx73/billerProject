import { Component, OnInit } from '@angular/core';
import { Goods } from 'src/app/common/goods';
import { PattiService } from 'src/app/services/patti.service';
import { FormGroup, FormControl, FormBuilder, FormArray} from '@angular/forms'
import { Metadata } from 'src/app/common/metadata';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-patti',
  templateUrl: './patti.component.html',
  styleUrls: ['./patti.component.css']
})
export class PattiComponent implements OnInit {
  form!: FormGroup;
  farmerId!: number;

  constructor(private fb: FormBuilder, private route:ActivatedRoute, private pattiService:PattiService) { }

  ngOnInit(): void {
    this.farmerId = this.route.snapshot.params['id'];
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
          return new Goods(item.price,item.weight,item.amount,item.advanceAmount,item.checkNumber,new Date(item.purchaseDate));
      });
      console.log(formData);
      this.saveDataToBackend(new Metadata(this.farmerId, new Date(), "pending", formData));
  }

  saveDataToBackend(formData:Metadata){
    console.log(formData);
    this.pattiService.saveMetadata(formData).subscribe(
      data => {
        console.log(data);
          // this.farmer = data.filter( record => record?.firstName.toLowerCase().includes(name.toLowerCase()))
      }
    )

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
