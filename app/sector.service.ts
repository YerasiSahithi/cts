import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SectorService {
  private baseUrl = 'http://localhost:8086/Sector/';  

  constructor(private http:HttpClient) { }
  getAllSector(): Observable<any> {  
    return this.http.get<any>(this.baseUrl+'/getAllSector');  
  }  
  saveSector(sector: object): Observable<object> {  
    return this.http.post(`${this.baseUrl}`+'saveSector', sector);  
  }  
  deleteSector(Id: Number): Observable<any> {  
    return this.http.delete(`${this.baseUrl}/deleteSector/${Id}`, { responseType: 'text' });  
  }  
  findOneInAll1234(Id: Number): Observable<Object> {  
    return this.http.get(`${this.baseUrl}/findOneInAll1234/${Id}`);  
  }  
  updateSector(Id: Number, value: any): Observable<Object> {  
    return this.http.put(`${this.baseUrl}/updateSector/${Id}`, value);  
  }  

}
