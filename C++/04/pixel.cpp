#include "pixel.h"
#include <iostream>

using namespace std;

Pixel::Pixel()
{
    SetX(0);
    SetY(0);
    vari = 0;
    cout << "Pixel luotu " << this << endl;
}

Pixel::~Pixel()
{
    cout << "Pixel vapautettu " << this << endl;
}

void Pixel::tulosta()
{
    cout << "Pixel X: " << GetX() << ", Y: " << GetY()
        << ", Vari: " << vari << endl;
}

void Pixel::tulostaVari()
{
    cout << "Pixel Colour: " << vari << endl;
}