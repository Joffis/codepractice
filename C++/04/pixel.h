#ifndef LINE
#define LINE

#include "point.h"

class Pixel : public Point
{
private:
    int vari;

public:
    Pixel();
    ~Pixel();
    void tulosta();
    void tulostaVari();
};

#endif