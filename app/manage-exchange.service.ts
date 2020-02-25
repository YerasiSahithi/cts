import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';  
import { Observable } from 'rxjs';  


@Injectable({
  providedIn: 'root'
})
export class ManageExchangeService {
  private baseUrl = 'http://localhost:8086/StockExchange/';  

  constructor(private http:HttpClient) { }
  getAllStockExchange(): Observable<any> {  
    return this.http.get<any>(this.baseUrl+'/getAllStockExchange');  
  }  
  saveStockExchange(exchange: object): Observable<object> {  
    return this.http.post(`${this.baseUrl}`+'saveStockExchange', exchange);  
  }  
  deleteStockExchange(Id: Number): Observable<any> {  
    return this.http.delete(`${this.baseUrl}/deleteCompany/${Id}`, { responseType: 'text' });  
  }  
  findOneInAll56(Id: Number): Observable<Object> {  
    return this.http.get(`${this.baseUrl}/findOneInAll56/${Id}`);  
  }  
  updateStockExchange(Id: Number, value: any): Observable<Object> {  
    return this.http.put(`${this.baseUrl}/updateStockExchange/${Id}`, value);  
  }  

}
