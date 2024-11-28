import { Component, OnInit } from '@angular/core';
import { ContractService } from '../../services/contract.service';

@Component({
  selector: 'app-contracts',
  templateUrl: './contracts.component.html',
})
export class ContractsComponent implements OnInit {
  contracts: any[] = [];

  constructor(private contractService: ContractService) {}

  ngOnInit(): void {
    this.contractService.getContracts().subscribe((data) => {
      this.contracts = data;
    });
  }
}
