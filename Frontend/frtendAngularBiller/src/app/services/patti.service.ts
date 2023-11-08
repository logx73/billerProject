import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Goods } from '../common/goods';
import { Metadata } from '../common/metadata';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PattiService {

  constructor(private httpClient: HttpClient) { }

  saveMetadata(metadata: Metadata){
    const headers = new Headers();
        headers.append('Content-Type', 'application/json; charset=utf-8');
        return this.httpClient.post('http://localhost:8080/saveMetadata', metadata);
  }

  getMetadataList(id: number): Observable<Metadata[]>{
    return this.httpClient.get<Metadata[]>('http://localhost:8080/getMetadata/'+id);
  }

}
