//
//  DashLineComponent.m
//  DashLineComponent
//

#import "DashLineComponent.h"

@implementation DashLineComponent
{
    UIColor *dashColor;
    CGFloat dashLineWidth;
    CGFloat dashLineSpace;
}

- (id)init {
    self = [super init];
    if (self) {
        dashColor = [UIColor blackColor];
        dashLineWidth = 4.0f;
        dashLineSpace = 2.0f;
    }
    return self;
}

- (void)setDashColor:(UIColor *)color
{
    dashColor = color;
    [self setNeedsDisplay];
}

- (void)setDashLineWidth:(CGFloat)width
{
    dashLineWidth = width;
    [self setNeedsDisplay];
}

- (void)setDashLineSpace:(CGFloat)space
{
    dashLineSpace = space;
    [self setNeedsDisplay];
}

- (void)layoutSubviews
{
    [super layoutSubviews];
    [self setNeedsDisplay];
}

-(void)drawRect:(CGRect)rect
{
    CGContextRef cx = UIGraphicsGetCurrentContext();
    CGContextBeginPath(cx);
    CGContextSetLineWidth(cx, self.bounds.size.height);
    CGContextSetStrokeColorWithColor(cx, dashColor.CGColor);

    CGFloat dash[] = {dashLineWidth, dashLineSpace};
    CGContextSetLineDash(cx, 0, dash, 2);

    CGContextMoveToPoint(cx, 0, 0.0f);
    CGContextAddLineToPoint(cx, self.bounds.size.width, 0.0f);
    CGContextStrokePath(cx);
    CGContextClosePath(cx);
}

@end
