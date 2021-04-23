// File created at: Friday, April 23, 2021
// File encoding  : UTF-8
// Line separator : LF
// Tab stop       : 4 spaces
// IDE            : IntelliJ IDEA community edition
package com.github.joelcho.chia.types.node;

import com.github.joelcho.chia.types.primitive.Bytes32;
import com.github.joelcho.chia.types.primitive.Uint64;
import lombok.Data;

/**
 * @author Joel
 */
@Data
public class ChallengeChainSubSlot {
    private VDFInfo challengeChainEndOfSlotVdf;
    private Bytes32 infusedChallengeChainSubSlotHash;
    private Bytes32 subepochSummaryHash;
    private Uint64 newSubSlotIters;
    private Uint64 newDifficulty;
}
