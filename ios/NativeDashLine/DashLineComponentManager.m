//
//  NativeDashLineComponentManager
//  NativeDashLine
//
//

#import "DashLineComponentManager.h"
#import "DashLineComponent.h"
#import "UIKit/UIKit.h"

@implementation DashLineComponentManager

RCT_EXPORT_MODULE()

- (UIView *)view
{
    DashLineComponent * theView;
    theView = [[DashLineComponent alloc] init];
    return theView;
}

RCT_EXPORT_VIEW_PROPERTY(dashColor, UIColor);
RCT_EXPORT_VIEW_PROPERTY(dashLineWidth, CGFloat);
RCT_EXPORT_VIEW_PROPERTY(dashLineSpace, CGFloat);

@end
