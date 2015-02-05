package grump;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;
import java.util.concurrent.atomic.AtomicBoolean;

public class JustPrintTheErrors implements ANTLRErrorListener {

    private final AtomicBoolean error = new AtomicBoolean(false);

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i2, String s, RecognitionException e) {
        error.set(true);
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i2, boolean b, BitSet bitSet, ATNConfigSet atnConfigs) {
        error.set(true);
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i2, BitSet bitSet, ATNConfigSet atnConfigs) {
        error.set(true);
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i2, int i3, ATNConfigSet atnConfigs) {
        error.set(true);
    }
    
    public boolean isError(){
        return error.get();
    }
}
