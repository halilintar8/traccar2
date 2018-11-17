package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class OrionProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        OrionProtocolDecoder decoder = new OrionProtocolDecoder(null);

        verifyPositions(decoder, binary(
                "5057000137bf6236235a0331b5c6e402a3b5ecff5102980003000e0c1d172936080e0c1d172936b03b01000882050000008e080000000000008c0300940500000084030085030003067600900113150000000000000000000000000000000000000004a4c8"));

        verifyPositions(decoder, binary(
                "5057004107367C242B440901ADE97D0163143B07B003000000000D041917382D000B0101000511000000000682050000008E080000000000008C0300840300850300090A0000000048010000008AFC"));

        verifyPositions(decoder, binary(
                "5057004107367C242C440901ADE97D0163143B07B003000000000D041917382D000B0101000513000000000682050000008E080000000000008C0300840300850300090A000000003BFEFFFF01FAE5"));

        verifyPositions(decoder, binary(
                "5057004107367C242D440901ADE97D0163143B07B003000000000D041917382D000B0101000514000000000682050000008E080000000000008C0300840300850300090A00000000FDFDFFFF023721"));

        verifyPositions(decoder, binary(
                "505700412ac86236354009114d20e402210f1f00d204000000000e06110d3414000b0101001228000000000682050000008e080000000000008c030084030085030003067b006801000930"));

    }

}
