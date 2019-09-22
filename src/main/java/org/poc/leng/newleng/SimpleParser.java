// Generated from Simple.g4 by ANTLR 4.4
package org.poc.leng.newleng;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, END=2, INT=3, FLOAT=4, BOOL=5, NUMBER=6, FLOTANTE=7, BOOLEAN=8, 
		ASSIG=9, IF_CON=10, ELSE=11, LPAR=12, RPAR=13, LKEY=14, RKEY=15, AND=16, 
		OR=17, DIST=18, IGUAL=19, MAY=20, MEN=21, WHILE=22, FOR=23, POINT=24, 
		SUM=25, REST=26, MULT=27, DIV=28, PRINT=29, READ=30, ID=31, COMMENT=32, 
		WS=33;
	public static final String[] tokenNames = {
		"<INVALID>", "'inicio'", "'fin'", "'entero'", "'real'", "'logico'", "NUMBER", 
		"FLOTANTE", "BOOLEAN", "'<-'", "IF_CON", "'sino'", "'('", "')'", "'{'", 
		"'}'", "'and'", "'or'", "'<>'", "'='", "'>'", "'<'", "'mientras'", "'para'", 
		"','", "'+'", "'-'", "'*'", "'/'", "'escribir'", "'leer'", "ID", "COMMENT", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_segments = 1, RULE_declaration = 2, RULE_assignation = 3, 
		RULE_date = 4, RULE_type_date = 5, RULE_start_block = 6, RULE_end_block = 7, 
		RULE_operation = 8, RULE_condition = 9, RULE_block_logic = 10, RULE_start_if = 11, 
		RULE_start_else = 12, RULE_end_if = 13, RULE_while_loop = 14, RULE_start_wh = 15, 
		RULE_end_wh = 16, RULE_for_loop = 17, RULE_rango = 18, RULE_start_for = 19, 
		RULE_end_for = 20, RULE_op_print = 21, RULE_op_read = 22;
	public static final String[] ruleNames = {
		"program", "segments", "declaration", "assignation", "date", "type_date", 
		"start_block", "end_block", "operation", "condition", "block_logic", "start_if", 
		"start_else", "end_if", "while_loop", "start_wh", "end_wh", "for_loop", 
		"rango", "start_for", "end_for", "op_print", "op_read"
	};

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public End_blockContext end_block() {
			return getRuleContext(End_blockContext.class,0);
		}
		public SegmentsContext segments(int i) {
			return getRuleContext(SegmentsContext.class,i);
		}
		public List<SegmentsContext> segments() {
			return getRuleContexts(SegmentsContext.class);
		}
		public Start_blockContext start_block() {
			return getRuleContext(Start_blockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); start_block();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << IF_CON) | (1L << ELSE) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << READ) | (1L << ID))) != 0)) {
				{
				{
				setState(47); segments();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53); end_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegmentsContext extends ParserRuleContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Op_printContext op_print() {
			return getRuleContext(Op_printContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Op_readContext op_read() {
			return getRuleContext(Op_readContext.class,0);
		}
		public Block_logicContext block_logic() {
			return getRuleContext(Block_logicContext.class,0);
		}
		public SegmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSegments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSegments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSegments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentsContext segments() throws RecognitionException {
		SegmentsContext _localctx = new SegmentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_segments);
		try {
			setState(62);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); assignation();
				}
				break;
			case IF_CON:
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(57); block_logic();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); while_loop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(59); for_loop();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(60); op_print();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(61); op_read();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public Type_dateContext type_date() {
			return getRuleContext(Type_dateContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); type_date();
				setState(65); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); type_date();
				setState(68); assignation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode ASSIG() { return getToken(SimpleParser.ASSIG, 0); }
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAssignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitAssignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(ID);
			setState(73); match(ASSIG);
			setState(74); operation(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(SimpleParser.BOOL, 0); }
		public TerminalNode FLOTANTE() { return getToken(SimpleParser.FLOTANTE, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NUMBER) | (1L << FLOTANTE) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_dateContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(SimpleParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(SimpleParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SimpleParser.FLOAT, 0); }
		public Type_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterType_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitType_date(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitType_date(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_dateContext type_date() throws RecognitionException {
		Type_dateContext _localctx = new Type_dateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_blockContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(SimpleParser.START, 0); }
		public Start_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterStart_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitStart_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitStart_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_blockContext start_block() throws RecognitionException {
		Start_blockContext _localctx = new Start_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_start_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(START);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_blockContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(SimpleParser.END, 0); }
		public End_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterEnd_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitEnd_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitEnd_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_blockContext end_block() throws RecognitionException {
		End_blockContext _localctx = new End_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_end_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(SimpleParser.MULT, 0); }
		public TerminalNode REST() { return getToken(SimpleParser.REST, 0); }
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SimpleParser.LPAR, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public TerminalNode RPAR() { return getToken(SimpleParser.RPAR, 0); }
		public TerminalNode SUM() { return getToken(SimpleParser.SUM, 0); }
		public TerminalNode DIV() { return getToken(SimpleParser.DIV, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(85); match(LPAR);
				setState(86); operation(0);
				setState(87); match(RPAR);
				}
				break;
			case BOOL:
			case NUMBER:
			case FLOTANTE:
			case ID:
				{
				setState(89); date();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(104);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(92);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(93); match(SUM);
						setState(94); operation(6);
						}
						break;
					case 2:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(95);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(96); match(REST);
						setState(97); operation(5);
						}
						break;
					case 3:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(98);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(99); match(MULT);
						setState(100); operation(4);
						}
						break;
					case 4:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(101);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(102); match(DIV);
						setState(103); operation(3);
						}
						break;
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode DIST() { return getToken(SimpleParser.DIST, 0); }
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode MEN() { return getToken(SimpleParser.MEN, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode AND() { return getToken(SimpleParser.AND, 0); }
		public TerminalNode LPAR() { return getToken(SimpleParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleParser.RPAR, 0); }
		public TerminalNode OR() { return getToken(SimpleParser.OR, 0); }
		public TerminalNode MAY() { return getToken(SimpleParser.MAY, 0); }
		public TerminalNode IGUAL() { return getToken(SimpleParser.IGUAL, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(110); match(LPAR);
				setState(111); condition(0);
				setState(112); match(RPAR);
				}
				break;
			case BOOL:
			case NUMBER:
			case FLOTANTE:
			case ID:
				{
				setState(114); date();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(117);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(118); match(AND);
						setState(119); condition(8);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(120);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(121); match(OR);
						setState(122); condition(7);
						}
						break;
					case 3:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124); match(DIST);
						setState(125); condition(6);
						}
						break;
					case 4:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(126);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(127); match(IGUAL);
						setState(128); condition(5);
						}
						break;
					case 5:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(130); match(MAY);
						setState(131); condition(4);
						}
						break;
					case 6:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(132);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(133); match(MEN);
						setState(134); condition(3);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Block_logicContext extends ParserRuleContext {
		public Start_ifContext start_if() {
			return getRuleContext(Start_ifContext.class,0);
		}
		public SegmentsContext segments(int i) {
			return getRuleContext(SegmentsContext.class,i);
		}
		public List<SegmentsContext> segments() {
			return getRuleContexts(SegmentsContext.class);
		}
		public Start_elseContext start_else() {
			return getRuleContext(Start_elseContext.class,0);
		}
		public End_ifContext end_if() {
			return getRuleContext(End_ifContext.class,0);
		}
		public Block_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterBlock_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitBlock_logic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitBlock_logic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_logicContext block_logic() throws RecognitionException {
		Block_logicContext _localctx = new Block_logicContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			switch (_input.LA(1)) {
			case IF_CON:
				{
				setState(140); start_if();
				}
				break;
			case ELSE:
				{
				setState(141); start_else();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << IF_CON) | (1L << ELSE) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << READ) | (1L << ID))) != 0)) {
				{
				{
				setState(144); segments();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150); end_if();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_ifContext extends ParserRuleContext {
		public TerminalNode LKEY() { return getToken(SimpleParser.LKEY, 0); }
		public TerminalNode IF_CON() { return getToken(SimpleParser.IF_CON, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Start_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterStart_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitStart_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitStart_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_ifContext start_if() throws RecognitionException {
		Start_ifContext _localctx = new Start_ifContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_start_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(IF_CON);
			setState(153); condition(0);
			setState(154); match(LKEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SimpleParser.ELSE, 0); }
		public TerminalNode LKEY() { return getToken(SimpleParser.LKEY, 0); }
		public Start_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterStart_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitStart_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitStart_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_elseContext start_else() throws RecognitionException {
		Start_elseContext _localctx = new Start_elseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_start_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(ELSE);
			setState(157); match(LKEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_ifContext extends ParserRuleContext {
		public TerminalNode RKEY() { return getToken(SimpleParser.RKEY, 0); }
		public End_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterEnd_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitEnd_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitEnd_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_ifContext end_if() throws RecognitionException {
		End_ifContext _localctx = new End_ifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_end_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(RKEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public End_whContext end_wh() {
			return getRuleContext(End_whContext.class,0);
		}
		public SegmentsContext segments(int i) {
			return getRuleContext(SegmentsContext.class,i);
		}
		public List<SegmentsContext> segments() {
			return getRuleContexts(SegmentsContext.class);
		}
		public Start_whContext start_wh() {
			return getRuleContext(Start_whContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); start_wh();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << IF_CON) | (1L << ELSE) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << READ) | (1L << ID))) != 0)) {
				{
				{
				setState(162); segments();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168); end_wh();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_whContext extends ParserRuleContext {
		public TerminalNode LKEY() { return getToken(SimpleParser.LKEY, 0); }
		public TerminalNode WHILE() { return getToken(SimpleParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Start_whContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_wh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterStart_wh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitStart_wh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitStart_wh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_whContext start_wh() throws RecognitionException {
		Start_whContext _localctx = new Start_whContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_start_wh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(WHILE);
			setState(171); condition(0);
			setState(172); match(LKEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_whContext extends ParserRuleContext {
		public TerminalNode RKEY() { return getToken(SimpleParser.RKEY, 0); }
		public End_whContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_wh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterEnd_wh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitEnd_wh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitEnd_wh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_whContext end_wh() throws RecognitionException {
		End_whContext _localctx = new End_whContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_end_wh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(RKEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public SegmentsContext segments(int i) {
			return getRuleContext(SegmentsContext.class,i);
		}
		public Start_forContext start_for() {
			return getRuleContext(Start_forContext.class,0);
		}
		public List<SegmentsContext> segments() {
			return getRuleContexts(SegmentsContext.class);
		}
		public End_forContext end_for() {
			return getRuleContext(End_forContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); start_for();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << IF_CON) | (1L << ELSE) | (1L << WHILE) | (1L << FOR) | (1L << PRINT) | (1L << READ) | (1L << ID))) != 0)) {
				{
				{
				setState(177); segments();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183); end_for();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangoContext extends ParserRuleContext {
		public List<TerminalNode> POINT() { return getTokens(SimpleParser.POINT); }
		public List<AssignationContext> assignation() {
			return getRuleContexts(AssignationContext.class);
		}
		public AssignationContext assignation(int i) {
			return getRuleContext(AssignationContext.class,i);
		}
		public TerminalNode POINT(int i) {
			return getToken(SimpleParser.POINT, i);
		}
		public TerminalNode LPAR() { return getToken(SimpleParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleParser.RPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RangoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rango; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterRango(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitRango(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitRango(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangoContext rango() throws RecognitionException {
		RangoContext _localctx = new RangoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rango);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(LPAR);
			setState(186); assignation();
			setState(187); match(POINT);
			setState(188); condition(0);
			setState(189); match(POINT);
			setState(190); assignation();
			setState(191); match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_forContext extends ParserRuleContext {
		public TerminalNode LKEY() { return getToken(SimpleParser.LKEY, 0); }
		public TerminalNode FOR() { return getToken(SimpleParser.FOR, 0); }
		public RangoContext rango() {
			return getRuleContext(RangoContext.class,0);
		}
		public Start_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterStart_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitStart_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitStart_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_forContext start_for() throws RecognitionException {
		Start_forContext _localctx = new Start_forContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_start_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(FOR);
			setState(194); rango();
			setState(195); match(LKEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_forContext extends ParserRuleContext {
		public TerminalNode RKEY() { return getToken(SimpleParser.RKEY, 0); }
		public End_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterEnd_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitEnd_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitEnd_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_forContext end_for() throws RecognitionException {
		End_forContext _localctx = new End_forContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_end_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(RKEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_printContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SimpleParser.PRINT, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Op_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterOp_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitOp_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitOp_print(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_printContext op_print() throws RecognitionException {
		Op_printContext _localctx = new Op_printContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(PRINT);
			setState(200); operation(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_readContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode READ() { return getToken(SimpleParser.READ, 0); }
		public TerminalNode LPAR() { return getToken(SimpleParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SimpleParser.RPAR, 0); }
		public Op_readContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterOp_read(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitOp_read(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitOp_read(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_readContext op_read() throws RecognitionException {
		Op_readContext _localctx = new Op_readContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(READ);
			setState(203); match(LPAR);
			setState(204); match(ID);
			setState(205); match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8: return operation_sempred((OperationContext)_localctx, predIndex);
		case 9: return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 7);
		case 5: return precpred(_ctx, 6);
		case 6: return precpred(_ctx, 5);
		case 7: return precpred(_ctx, 4);
		case 8: return precpred(_ctx, 3);
		case 9: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 4);
		case 2: return precpred(_ctx, 3);
		case 3: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\7"+
		"\2\63\n\2\f\2\16\2\66\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3A\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n]\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13v\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d"+
		"\13\13\3\f\3\f\5\f\u0091\n\f\3\f\7\f\u0094\n\f\f\f\16\f\u0097\13\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\7\20\u00a6\n\20"+
		"\f\20\16\20\u00a9\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\7\23\u00b5\n\23\f\23\16\23\u00b8\13\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\2\4\22\24\31\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\2\4\4\2\7\t!!\3\2\5\7\u00d2\2\60\3\2\2\2\4@\3\2\2\2"+
		"\6H\3\2\2\2\bJ\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16R\3\2\2\2\20T\3\2\2\2\22"+
		"\\\3\2\2\2\24u\3\2\2\2\26\u0090\3\2\2\2\30\u009a\3\2\2\2\32\u009e\3\2"+
		"\2\2\34\u00a1\3\2\2\2\36\u00a3\3\2\2\2 \u00ac\3\2\2\2\"\u00b0\3\2\2\2"+
		"$\u00b2\3\2\2\2&\u00bb\3\2\2\2(\u00c3\3\2\2\2*\u00c7\3\2\2\2,\u00c9\3"+
		"\2\2\2.\u00cc\3\2\2\2\60\64\5\16\b\2\61\63\5\4\3\2\62\61\3\2\2\2\63\66"+
		"\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\5"+
		"\20\t\28\3\3\2\2\29A\5\6\4\2:A\5\b\5\2;A\5\26\f\2<A\5\36\20\2=A\5$\23"+
		"\2>A\5,\27\2?A\5.\30\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2@<\3\2\2\2@=\3\2\2"+
		"\2@>\3\2\2\2@?\3\2\2\2A\5\3\2\2\2BC\5\f\7\2CD\7!\2\2DI\3\2\2\2EF\5\f\7"+
		"\2FG\5\b\5\2GI\3\2\2\2HB\3\2\2\2HE\3\2\2\2I\7\3\2\2\2JK\7!\2\2KL\7\13"+
		"\2\2LM\5\22\n\2M\t\3\2\2\2NO\t\2\2\2O\13\3\2\2\2PQ\t\3\2\2Q\r\3\2\2\2"+
		"RS\7\3\2\2S\17\3\2\2\2TU\7\4\2\2U\21\3\2\2\2VW\b\n\1\2WX\7\16\2\2XY\5"+
		"\22\n\2YZ\7\17\2\2Z]\3\2\2\2[]\5\n\6\2\\V\3\2\2\2\\[\3\2\2\2]l\3\2\2\2"+
		"^_\f\7\2\2_`\7\33\2\2`k\5\22\n\bab\f\6\2\2bc\7\34\2\2ck\5\22\n\7de\f\5"+
		"\2\2ef\7\35\2\2fk\5\22\n\6gh\f\4\2\2hi\7\36\2\2ik\5\22\n\5j^\3\2\2\2j"+
		"a\3\2\2\2jd\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\23\3\2\2"+
		"\2nl\3\2\2\2op\b\13\1\2pq\7\16\2\2qr\5\24\13\2rs\7\17\2\2sv\3\2\2\2tv"+
		"\5\n\6\2uo\3\2\2\2ut\3\2\2\2v\u008b\3\2\2\2wx\f\t\2\2xy\7\22\2\2y\u008a"+
		"\5\24\13\nz{\f\b\2\2{|\7\23\2\2|\u008a\5\24\13\t}~\f\7\2\2~\177\7\24\2"+
		"\2\177\u008a\5\24\13\b\u0080\u0081\f\6\2\2\u0081\u0082\7\25\2\2\u0082"+
		"\u008a\5\24\13\7\u0083\u0084\f\5\2\2\u0084\u0085\7\26\2\2\u0085\u008a"+
		"\5\24\13\6\u0086\u0087\f\4\2\2\u0087\u0088\7\27\2\2\u0088\u008a\5\24\13"+
		"\5\u0089w\3\2\2\2\u0089z\3\2\2\2\u0089}\3\2\2\2\u0089\u0080\3\2\2\2\u0089"+
		"\u0083\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\25\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0091"+
		"\5\30\r\2\u008f\u0091\5\32\16\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2"+
		"\2\u0091\u0095\3\2\2\2\u0092\u0094\5\4\3\2\u0093\u0092\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\5\34\17\2\u0099\27\3\2\2\2\u009a\u009b\7\f"+
		"\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7\20\2\2\u009d\31\3\2\2\2\u009e"+
		"\u009f\7\r\2\2\u009f\u00a0\7\20\2\2\u00a0\33\3\2\2\2\u00a1\u00a2\7\21"+
		"\2\2\u00a2\35\3\2\2\2\u00a3\u00a7\5 \21\2\u00a4\u00a6\5\4\3\2\u00a5\u00a4"+
		"\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\5\"\22\2\u00ab\37\3\2\2"+
		"\2\u00ac\u00ad\7\30\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00af\7\20\2\2\u00af"+
		"!\3\2\2\2\u00b0\u00b1\7\21\2\2\u00b1#\3\2\2\2\u00b2\u00b6\5(\25\2\u00b3"+
		"\u00b5\5\4\3\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\5*\26\2\u00ba%\3\2\2\2\u00bb\u00bc\7\16\2\2\u00bc\u00bd\5\b\5\2"+
		"\u00bd\u00be\7\32\2\2\u00be\u00bf\5\24\13\2\u00bf\u00c0\7\32\2\2\u00c0"+
		"\u00c1\5\b\5\2\u00c1\u00c2\7\17\2\2\u00c2\'\3\2\2\2\u00c3\u00c4\7\31\2"+
		"\2\u00c4\u00c5\5&\24\2\u00c5\u00c6\7\20\2\2\u00c6)\3\2\2\2\u00c7\u00c8"+
		"\7\21\2\2\u00c8+\3\2\2\2\u00c9\u00ca\7\37\2\2\u00ca\u00cb\5\22\n\2\u00cb"+
		"-\3\2\2\2\u00cc\u00cd\7 \2\2\u00cd\u00ce\7\16\2\2\u00ce\u00cf\7!\2\2\u00cf"+
		"\u00d0\7\17\2\2\u00d0/\3\2\2\2\17\64@H\\jlu\u0089\u008b\u0090\u0095\u00a7"+
		"\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}