import { Component, OnInit } from '@angular/core';
import { ManageExchangeService } from '../manage-exchange.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-exchangelist',
  templateUrl: './exchangelist.component.html',
  styleUrls: ['./exchangelist.component.css']
})
export class ExchangelistComponent implements OnInit {

  constructor(private manageexchangeservice:ManageExchangeService) { }
  stockExchangeList:Observable<any[]>

  ngOnInit() {
    this.manageexchangeservice.getAllStockExchange().subscribe(data =>{  
      this.stockExchangeList =data;  
  
  })

  }

}
