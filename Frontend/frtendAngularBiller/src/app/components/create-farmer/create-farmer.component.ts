import { Component, OnInit } from '@angular/core';
import { Farmer } from 'src/app/common/farmer';
import { FarmerService } from 'src/app/services/farmer.service';

@Component({
  selector: 'app-create-farmer',
  templateUrl: './create-farmer.component.html',
  styleUrls: ['./create-farmer.component.css']
})
export class CreateFarmerComponent implements OnInit {
  farmer: Farmer = new Farmer(0,'','','','','');

  constructor(private farmerService:FarmerService) { }

  ngOnInit(): void {
  }

  onSubmit(){
    console.log(this.farmer.firstName);
    this.farmerService.saveFarmer(this.farmer).subscribe(
      data => {
        console.log(data);
          // this.farmer = data.filter( record => record?.firstName.toLowerCase().includes(name.toLowerCase()))
      }
    )
  }

}
