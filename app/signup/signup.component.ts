import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';
 import {FormControl,FormGroup,Validators} from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  

  constructor(private userservice:UserService) { }
  user : User=new User();  
  submitted = false;  

  ngOnInit() {
    this.submitted=false;  

  }
  usersaveform=new FormGroup({ 
    userType:new FormControl() , 
    Id:new FormControl() , 
    userName:new FormControl() , 
    password:new FormControl('' , [Validators.required , Validators.minLength(5) ] ),  
    email:new FormControl('',[Validators.required,Validators.email]),  
    phone:new FormControl('',[Validators.required,Validators.maxLength(10)]),
    confirmed:new FormControl()  
  
  });  
  saveUser(saveUser){  
    this.user=new User();
    this.user.id=this.UId.value;   
    this.user.userName=this.UserName.value;  
    this.user.userType=this.UserType.value;  
    this.user.password=this.Password.value; 
    this.user.email=this.Email.value; 
    this.user.phone=this.Phone.value; 
    this.user.confirmed="yes"; 

    this.submitted = true;  
    this.save();  
  }  
  save() {
    this.userservice.saveUser(this.user)  
      .subscribe(data => console.log(data), error => console.log(error));  
    this.user = new User();  
  }
  get UserType(){  
    return this.usersaveform.get('userType');  
  }  

  get UId(){  
    return this.usersaveform.get('id');  
  }  
  get UserName(){  
    return this.usersaveform.get('userName');  
  }  

  get Password(){  
    return this.usersaveform.get('password');  
  }  
  get Email(){  
    return this.usersaveform.get('email');  
  }  

  get Phone(){  
    return this.usersaveform.get('phone');  
  }  


 /*get Confirmed(){  
    return this.usersaveform.get('confirmed');  
  } */
  
  saveUserForm(){  
    this.submitted=false;  
    this.usersaveform.reset();  
  }  

}
