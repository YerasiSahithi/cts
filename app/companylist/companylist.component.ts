import { Component, OnInit } from '@angular/core';
import { Observable,Subject } from "rxjs";  
import { ManageCompanyService } from '../manage-company.service';

@Component({
  selector: 'app-companylist',
  templateUrl: './companylist.component.html',
  styleUrls: ['./companylist.component.css']
})
export class CompanylistComponent implements OnInit {

  constructor(private companyservice:ManageCompanyService) { }
  companyList:Observable<any[]>

  ngOnInit() {
    this.companyservice.getAllCompany().subscribe(data =>{  
      this.companyList =data;  
  
  })
  }
  }


