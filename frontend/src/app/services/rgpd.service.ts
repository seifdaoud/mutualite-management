import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class RgpdService {
  private apiUrl = 'http://localhost:8080/api/utilisateurs';

  constructor(private http: HttpClient) {}

  exportData(): Observable<any> {
    return this.http.get(`${this.apiUrl}/export-data`);
  }

  requestDataDeletion(): Observable<void> {
    return this.http.delete(`${this.apiUrl}/delete-data`);
  }
}
