package protocol.opcode;

public enum  OpCode {
    REQ((byte)0),
    RES((byte)1),
    PING((byte)2),
    PONG((byte)3);


    private byte code;

    OpCode(byte code) {
        this.code = code;
    }
}
