package grump;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public class GrumPParseTree implements ParseTreeListener {
    @Override
    public void visitTerminal(TerminalNode terminalNode) {
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
//                                System.out.println(parserRuleContext);
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {
//                                System.out.println(parserRuleContext);
    }
}
