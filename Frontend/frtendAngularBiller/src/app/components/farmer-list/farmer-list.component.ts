import { Component, OnInit } from '@angular/core';
import { Farmer } from 'src/app/common/farmer';
import { FarmerService } from 'src/app/services/farmer.service';

@Component({
  selector: 'app-farmer-list',
  templateUrl: './farmer-list.component.html',
  styleUrls: ['./farmer-list.component.css']
})
export class FarmerListComponent implements OnInit {

  farmer: Farmer[] = [];
  constructor(private farmerService: FarmerService) { }

  ngOnInit(): void {
  }

  farmerList(name : string) {
    this.farmerService.getFarmerList(name).subscribe(
      data => {
            this.farmer = data;
          // this.farmer = data.filter( record => record?.firstName.toLowerCase().includes(name.toLowerCase()))
      }
    )
  }
}
