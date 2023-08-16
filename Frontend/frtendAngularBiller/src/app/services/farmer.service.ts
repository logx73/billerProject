import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Farmer } from '../common/farmer';
import { map } from 'rxjs/operators'

@Injectable({
  providedIn: 'root'
})
export class FarmerService {

  constructor(private httpClient: HttpClient) { }
  
  getFarmerList(str: string): Observable<Farmer[]>{
    return this.httpClient.get<Farmer[]>('http://localhost:8080/getFarmer/'+str);
  }
}

interface GetResponse{
    _embedded: {
      farmer: Farmer[];
    }
}
