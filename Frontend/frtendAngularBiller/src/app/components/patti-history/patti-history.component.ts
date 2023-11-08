import { Component, Input, OnInit } from '@angular/core';
import { Metadata } from 'src/app/common/metadata';
import { PattiService } from 'src/app/services/patti.service';

@Component({
  selector: 'app-patti-history',
  templateUrl: './patti-history.component.html',
  styleUrls: ['./patti-history.component.css']
})
export class PattiHistoryComponent implements OnInit {
  @Input() farmerId!: number;
  metadata!: Metadata[];

  constructor(private pattiService:PattiService) { }

  ngOnInit(): void {
    this.getMetadataByFarmerId();
  }

  getMetadataByFarmerId(){
      this.pattiService.getMetadataList(this.farmerId).subscribe(
        data => {
          console.log(data);
          this.metadata = data;
        }
      );
  }
}
