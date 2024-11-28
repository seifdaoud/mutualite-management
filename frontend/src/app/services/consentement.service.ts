import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Consentement } from '../models/consentement';

@Injectable({
  providedIn: 'root',
})
export class ConsentementService {
  private apiUrl = 'http://localhost:8080/api/consentements';

  constructor(private http: HttpClient) {}

  getAllConsentements(): Observable<Consentement[]> {
    return this.http.get<Consentement[]>(this.apiUrl);
  }

  revokeConsentement(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
