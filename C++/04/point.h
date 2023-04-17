#ifndef POINT
#define POINT

class Point
{
private:
    int x_;
    int y_;

public:
    Point();
    Point(int x, int y);
    virtual ~Point();
    void SetX(int x);
    int GetX();
    void SetY(int y);
    int GetY();
    virtual void tulosta();
};

#endif