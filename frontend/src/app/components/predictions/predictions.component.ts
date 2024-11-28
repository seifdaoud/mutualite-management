import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-predictions',
  templateUrl: './predictions.component.html',
})
export class PredictionsComponent implements OnInit {
  predictions: any[] = [
    { contrat: 'C123', probabilite: 85 },
    { contrat: 'C124', probabilite: 72 },
  ];

  ngOnInit(): void {}
}
