// File created at: Thursday, April 22, 2021
// File encoding  : UTF-8
// Line separator : LF
// Tab stop       : 4 spaces
// IDE            : IntelliJ IDEA community edition
package com.github.joelcho.chia;

import com.github.joelcho.chia.types.node.*;
import com.github.joelcho.chia.types.primitive.Uint128;

import java.lang.reflect.Type;

/**
 * @author Joel
 */
public class Action {

    public static final int SEC_TYPE_VALUE = 0;
    public static final int SEC_TYPE_COLLECTION = 1;
    public static final int SEC_TYPE_MAP = 2;

    public static final Action GET_BLOCKCHAIN_STATE
            = new Action("get_blockchain_state", "blockchain_state", BlockchainState.class);

    public static final Action GET_BLOCK
            = new Action("get_block", "block", Block.class);

    public static final Action GET_BLOCKS
            = new Action("get_blocks", "blocks", Block.class, SEC_TYPE_COLLECTION);

    public static final Action GET_BLOCK_RECORD_BY_HEIGHT
            = new Action("get_block_record_by_height", "block_record", BlockRecord.class);

    public static final Action GET_BLOCK_RECORD
            = new Action("get_block_record", "block_record", BlockRecord.class);

    public static final Action GET_BLOCK_RECORDS
            = new Action("get_block_records", "block_records", BlockRecord.class, SEC_TYPE_COLLECTION);

    public static final Action GET_UNFINISHED_BLOCK_HEADERS
            = new Action("get_unfinished_block_headers", "headers", UnfinishedHeaderBlock.class, SEC_TYPE_COLLECTION);

    public static final Action GET_NETWORK_SPACE
            = new Action("get_network_space", "space", Uint128.class);

    public static final Action GET_ADDITIONS_AND_REMOVALS
            = new Action("get_additions_and_removals", null, AdditionsAndRemovals.class);

    public static final Action GET_INITIAL_FREEZE_PERIOD
            = new Action("get_initial_freeze_period", "INITIAL_FREEZE_PERIOD", Long.class);

    public static final Action GET_NETWORK_INFO
            = new Action("get_network_info", null, NetworkInfo.class);

    public static final Action GET_COIN_RECORDS_BY_PUZZLE_HASH
            = new Action("get_coin_records_by_puzzle_hash", "coin_records", CoinRecord.class, SEC_TYPE_COLLECTION);

    public static final Action GET_COIN_RECORD_BY_NAME
            = new Action("get_coin_record_by_name", "coin_record", CoinRecord.class);

    public static final Action GET_ALL_MEMPOOL_TX_IDS
            = new Action("get_all_mempool_tx_ids", "tx_ids", String.class, SEC_TYPE_COLLECTION);

    public static final Action GET_MEMPOOL_ITEM_BY_TX_ID
            = new Action("get_mempool_item_by_tx_id", "mempool_item", MempoolItem.class);

    private final String methodName;
    private final String resultFieldName;
    private final Type returnType;
    private final int secondType;

    public Action(String methodName, String resultFieldName, Type returnType, int secondType) {
        this.methodName = methodName;
        this.resultFieldName = resultFieldName;
        this.returnType = returnType;
        this.secondType = secondType;
    }

    public Action(String methodName, String resultFieldName, Type returnType) {
        this(methodName, resultFieldName, returnType, SEC_TYPE_VALUE);
    }

    public String getMethodName() {
        return methodName;
    }

    public String getResultFieldName() {
        return resultFieldName;
    }

    public Type getReturnType() {
        return returnType;
    }

    public int getSecondType() {
        return secondType;
    }
}
