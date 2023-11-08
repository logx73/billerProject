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

  getFarmerById(id: number): Observable<Farmer>{
    return this.httpClient.get<Farmer>('http://localhost:8080/getFarmerById/'+id);
  }

  saveFarmer(farmer: Farmer){
    const headers = new Headers();
        headers.append('Content-Type', 'application/json; charset=utf-8');
        return this.httpClient.post<Farmer>('http://localhost:8080/saveFarmer', farmer);
  }
  
}

