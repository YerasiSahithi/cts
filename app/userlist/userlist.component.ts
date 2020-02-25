import { Component, OnInit } from '@angular/core';
import { Observable,Subject } from "rxjs";  
  
import {FormControl,FormGroup,Validators} from '@angular/forms';  
import { UserService } from '../user.service';
import { User } from '../user';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserListComponent implements OnInit {

  constructor(private userservice:UserService) { }
  userList:Observable<any[]>
  ngOnInit() {
    this.userservice.getAllUser().subscribe(data =>{  
      this.userList =data;  
  
  })
  }

  }
