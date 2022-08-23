package Home8And11.InputOutputServis;

import Home8And11.Body.Transport;

public interface InputOutputStorage {
    Transport[] readTransports();
    void writeTransports(Transport[] transports);
}
