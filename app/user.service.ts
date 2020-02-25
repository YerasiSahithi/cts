import { Injectable } from '@angular/core';  
import { HttpClient } from '@angular/common/http';  
import { Observable } from 'rxjs';  
  
@Injectable({  
  providedIn: 'root'  
})  
  
export class UserService {
  getuserList() {
    throw new Error("Method not implemented.");
  }  
  
  private baseUrl = 'http://localhost:8086/User/';  
  
  constructor(private http:HttpClient) { }  
  
  getAllUser(): Observable<any> {  
    return this.http.get<any>(this.baseUrl+'/getAllUser');  
  }  
  
  saveUser(User: object): Observable<object> {  
    return this.http.post(`${this.baseUrl}`+'saveUser', User);  
  }  
  
  deleteUser(Id: number): Observable<any> {  
    return this.http.delete(`${this.baseUrl}/deleteUser/${Id}`, { responseType: 'text' });  
  }  
  
  findoneinallUser(Id: number): Observable<Object> {  
    return this.http.get(`${this.baseUrl}/findoneinall/${Id}`);  
  }  
  
  updateuser(Id: number, value: any): Observable<Object> {  
    return this.http.put(`${this.baseUrl}/updateUser/${Id}`, value);  
  }  
    
}  

