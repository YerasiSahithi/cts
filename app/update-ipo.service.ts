import { HttpClient } from '@angular/common/http';  
import { Observable } from 'rxjs';  
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UpdateIpoService {
  getuserList() {
    throw new Error("Method not implemented.");
  }  
  private baseUrl = 'http://localhost:8086/IPO/';  

  constructor(private http:HttpClient) { }
  getAllIPO(): Observable<any> {  
    return this.http.get<any>(this.baseUrl+'/getAllIPO');  
  }  
  saveIPO(IPO: object): Observable<object> {  
    return this.http.post(`${this.baseUrl}`+'saveIPO', IPO);  
  }  
  deleteIPO(Id: number): Observable<any> {  
    return this.http.delete(`${this.baseUrl}/updateIPO/${Id}`, { responseType: 'text' });  
  }  
  findOneInAll123(Id: number): Observable<Object> {  
    return this.http.get(`${this.baseUrl}/findOneInAll123/${Id}`);  
  }  
  updateIPO(Id: number, value: any): Observable<Object> {  
    return this.http.put(`${this.baseUrl}/updateIPO/${Id}`, value);  
  }  

}
