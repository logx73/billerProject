import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Goods } from '../common/goods';
import { Metadata } from '../common/metadata';

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
}
