#ifndef LINE
#define LINE

#include "point.h"

class Line
{
private:
    Point* begin_;
    Point* end_;

public:
    Line(Point* begin, Point* end);
    Line(int x1, int y1, int x2, int y2);
    Line(const Line& l);
    ~Line();
    void SetLine(int x1, int y1, int x2, int y2);
    void print();
};

#endif