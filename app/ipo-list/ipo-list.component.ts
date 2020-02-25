import { Component, OnInit } from '@angular/core';
import { UpdateIpoService } from '../update-ipo.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-ipo-list',
  templateUrl: './ipo-list.component.html',
  styleUrls: ['./ipo-list.component.css']
})
export class IpoListComponent implements OnInit {

  constructor(private updateiposervice:UpdateIpoService) { }
  IPOList:Observable<any[]>

  ngOnInit() {
    this.updateiposervice.getAllIPO().subscribe(data =>{  
      this.IPOList =data;  
  
  })

  }

}
