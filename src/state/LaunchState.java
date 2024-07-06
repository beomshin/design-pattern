package state;

public class LaunchState implements State{

    private static LaunchState singleton = new LaunchState();

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 12) {
            context.changeState(DayState.getInstance());
        } else if (13 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("비상: 점심 시간 금고 사용!");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(점식시간)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("점식시간 통화 녹음");
    }

    @Override
    public String toString() {
        return "[점식시간]";
    }
}
