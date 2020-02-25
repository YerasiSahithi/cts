import { Component, OnInit } from '@angular/core';
import { SectorService } from '../sector.service';
import { Sector } from '../sector';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-sector',
  templateUrl: './sector.component.html',
  styleUrls: ['./sector.component.css']
})
export class SectorComponent implements OnInit {

  constructor(private sectorservice:SectorService) { }
  sectors : Sector=new Sector();  
  submitted = false;  

  ngOnInit() {
    this.submitted=false;  

  }
  sectorsaveform=new FormGroup({ 
    id:new FormControl() , 
    stockName:new FormControl() , 
    brief:new FormControl() , 
  
  });  
  saveSector(saveSector){  
    this.sectors=new Sector ();
    this.sectors.id=this.Id.value;   
    this.sectors.stockName=this.StockExchange.value;  
    this.sectors.brief=this.Brief.value;  

    this.submitted = true;  
    this.save();  
  }  
  save() {

    this.sectorservice.saveSector(this.sectors).subscribe(data => console.log(data), error => console.log(error));

  
    this.sectors = new Sector();
  
   }   


}
