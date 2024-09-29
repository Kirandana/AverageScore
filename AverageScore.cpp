#include <iostream>
using namespace std;

int main() {
    int SiswaPertama, SiswaKedua, SiswaKetiga;
    
    cout << "NILAI TEST PERTAMA: ";
    cin >> SiswaPertama;
    
    cout << "NILAI TEST KEDUA: ";
    cin >> SiswaKedua;
    
    cout << "NILAI TEST KETIGA: ";
    cin >> SiswaKetiga;
    
    double Sum = SiswaPertama + SiswaKedua + SiswaKetiga;
    double hasilSum = Sum / 3;
    
    if (hasilSum >= 95) {
        cout << "Selamat!" << endl;
    }
    
    cout << "Nilai rata-rata anda adalah: " << hasilSum << endl;
    
    return 0;
}
