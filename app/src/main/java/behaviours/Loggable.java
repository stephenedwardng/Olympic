package behaviours;

import java.io.IOException;

/**
 * Created by user on 27/06/2017.
 */

public interface Loggable {

    void saveSession(Integer lastSession) throws IOException;

    void saveAllSessions(Integer allSessionsTotal) throws IOException;
}
