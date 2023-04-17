#include <iostream>
#include "point.h"
#include "pixel.h"

using namespace std;

/*
    Q: Mitä tapahtuu ja miksi, jos tulosta-kutsun 
       sijasta lukeekin tulostaVari?
    A: Ohjelma ei käänny koska tulostaVari funktiota ei ole
       Point luokassa ja puolet taulukon olioista ovat Point olioita.
*/

int main()
{
    Point *pointit[4];
    pointit[0] = new Point();
    pointit[1] = new Pixel();
    pointit[2] = new Point();
    pointit[3] = new Pixel();
    cout << "---------------" << endl;
    for(int i = 0; i<4; i++){
        pointit[i]->tulosta();
    }
    cout << "---------------" << endl;
    for(int i = 0; i<4; i++){
        delete pointit[i];
    }

    return 0;
}