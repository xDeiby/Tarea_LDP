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
		START=1, END=2, SUM=3, REST=4, MULT=5, DIV=6, NUMBER=7, FLOTANTE=8, BOOLEANO=9, 
		INT=10, FLOAT=11, BOOL=12, ASSIG=13, MAY_Q=14, MEN_Q=15, IGUAL=16, AND=17, 
		OR=18, PAR_L=19, PAR_R=20, KEY_L=21, KEY_R=22, IF=23, ELSE=24, ELIF=25, 
		ENDIF=26, FOR=27, ENDFOR=28, DELIM=29, WHILE=30, ENDWH=31, READ=32, WRITTE=33, 
		ID=34, COMMENT=35, WS=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'inicio'", "'fin'", "'+'", "'-'", "'*'", "'/'", "NUMBER", 
		"FLOTANTE", "BOOLEANO", "'entero'", "'real'", "'logico'", "'<-'", "'>'", 
		"'<'", "'='", "'and'", "'or'", "'('", "')'", "KEY_L", "KEY_R", "'si'", 
		"'sino'", "'sino_si'", "'fin_si'", "'para'", "'fin_para'", "';'", "'mientras'", 
		"'fin_mientras'", "'leer'", "'escribir'", "ID", "COMMENT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_sentences = 1, RULE_type_data = 2, RULE_date = 3, 
		RULE_decla = 4, RULE_assign_var = 5, RULE_operation = 6, RULE_sent_logic = 7, 
		RULE_condition = 8, RULE_while_loop = 9, RULE_for_loop = 10, RULE_writte_op = 11, 
		RULE_read_op = 12;
	public static final String[] ruleNames = {
		"program", "sentences", "type_data", "date", "decla", "assign_var", "operation", 
		"sent_logic", "condition", "while_loop", "for_loop", "writte_op", "read_op"
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
		public List<SentencesContext> sentences() {
			return getRuleContexts(SentencesContext.class);
		}
		public SentencesContext sentences(int i) {
			return getRuleContext(SentencesContext.class,i);
		}
		public TerminalNode END() { return getToken(SimpleParser.END, 0); }
		public TerminalNode START() { return getToken(SimpleParser.START, 0); }
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
			setState(26); match(START);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << READ) | (1L << WRITTE) | (1L << ID))) != 0)) {
				{
				{
				setState(27); sentences();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33); match(END);
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

	public static class SentencesContext extends ParserRuleContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Read_opContext read_op() {
			return getRuleContext(Read_opContext.class,0);
		}
		public Writte_opContext writte_op() {
			return getRuleContext(Writte_opContext.class,0);
		}
		public Sent_logicContext sent_logic() {
			return getRuleContext(Sent_logicContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public DeclaContext decla() {
			return getRuleContext(DeclaContext.class,0);
		}
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public SentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSentences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentencesContext sentences() throws RecognitionException {
		SentencesContext _localctx = new SentencesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentences);
		try {
			setState(42);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(35); decla();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); assign_var();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(37); sent_logic();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(38); for_loop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(39); while_loop();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 6);
				{
				setState(40); read_op();
				}
				break;
			case WRITTE:
				enterOuterAlt(_localctx, 7);
				{
				setState(41); writte_op();
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

	public static class Type_dataContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(SimpleParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(SimpleParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SimpleParser.FLOAT, 0); }
		public Type_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterType_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitType_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitType_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_dataContext type_data() throws RecognitionException {
		Type_dataContext _localctx = new Type_dataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode BOOLEANO() { return getToken(SimpleParser.BOOLEANO, 0); }
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
		enterRule(_localctx, 6, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << FLOTANTE) | (1L << BOOLEANO) | (1L << ID))) != 0)) ) {
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

	public static class DeclaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public Type_dataContext type_data() {
			return getRuleContext(Type_dataContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode ASSIG() { return getToken(SimpleParser.ASSIG, 0); }
		public DeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitDecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaContext decla() throws RecognitionException {
		DeclaContext _localctx = new DeclaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decla);
		try {
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); type_data();
				setState(49); match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); type_data();
				setState(52); match(ID);
				setState(53); match(ASSIG);
				setState(54); operation(0);
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

	public static class Assign_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode ASSIG() { return getToken(SimpleParser.ASSIG, 0); }
		public Assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAssign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAssign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitAssign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_varContext assign_var() throws RecognitionException {
		Assign_varContext _localctx = new Assign_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(ID);
			setState(59); match(ASSIG);
			setState(60); operation(0);
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
		public TerminalNode PAR_R() { return getToken(SimpleParser.PAR_R, 0); }
		public TerminalNode MULT() { return getToken(SimpleParser.MULT, 0); }
		public TerminalNode PAR_L() { return getToken(SimpleParser.PAR_L, 0); }
		public TerminalNode REST() { return getToken(SimpleParser.REST, 0); }
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			switch (_input.LA(1)) {
			case PAR_L:
				{
				setState(63); match(PAR_L);
				setState(64); operation(0);
				setState(65); match(PAR_R);
				}
				break;
			case NUMBER:
			case FLOTANTE:
			case BOOLEANO:
			case ID:
				{
				setState(67); date();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(82);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(70);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(71); match(SUM);
						setState(72); operation(7);
						}
						break;
					case 2:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(73);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(74); match(REST);
						setState(75); operation(6);
						}
						break;
					case 3:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(76);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(77); match(MULT);
						setState(78); operation(5);
						}
						break;
					case 4:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(79);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(80); match(DIV);
						setState(81); operation(4);
						}
						break;
					}
					} 
				}
				setState(86);
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

	public static class Sent_logicContext extends ParserRuleContext {
		public List<TerminalNode> KEY_L() { return getTokens(SimpleParser.KEY_L); }
		public TerminalNode KEY_L(int i) {
			return getToken(SimpleParser.KEY_L, i);
		}
		public List<SentencesContext> sentences() {
			return getRuleContexts(SentencesContext.class);
		}
		public SentencesContext sentences(int i) {
			return getRuleContext(SentencesContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SimpleParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(SimpleParser.IF, 0); }
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(SimpleParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(SimpleParser.ELIF, i);
		}
		public TerminalNode ENDIF() { return getToken(SimpleParser.ENDIF, 0); }
		public List<TerminalNode> KEY_R() { return getTokens(SimpleParser.KEY_R); }
		public TerminalNode KEY_R(int i) {
			return getToken(SimpleParser.KEY_R, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public Sent_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSent_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSent_logic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSent_logic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sent_logicContext sent_logic() throws RecognitionException {
		Sent_logicContext _localctx = new Sent_logicContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sent_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(IF);
			setState(88); condition(0);
			setState(89); match(KEY_L);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << READ) | (1L << WRITTE) | (1L << ID))) != 0)) {
				{
				{
				setState(90); sentences();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96); match(KEY_R);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(97); match(ELIF);
				setState(98); condition(0);
				setState(99); match(KEY_L);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << READ) | (1L << WRITTE) | (1L << ID))) != 0)) {
					{
					{
					setState(100); sentences();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106); match(KEY_R);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(113); match(ELSE);
				setState(114); condition(0);
				setState(115); match(KEY_L);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << READ) | (1L << WRITTE) | (1L << ID))) != 0)) {
					{
					{
					setState(116); sentences();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122); match(KEY_R);
				}
			}

			setState(126); match(ENDIF);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode PAR_R() { return getToken(SimpleParser.PAR_R, 0); }
		public TerminalNode MAY_Q() { return getToken(SimpleParser.MAY_Q, 0); }
		public TerminalNode PAR_L() { return getToken(SimpleParser.PAR_L, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode AND() { return getToken(SimpleParser.AND, 0); }
		public TerminalNode MEN_Q() { return getToken(SimpleParser.MEN_Q, 0); }
		public TerminalNode OR() { return getToken(SimpleParser.OR, 0); }
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			switch (_input.LA(1)) {
			case PAR_L:
				{
				setState(129); match(PAR_L);
				setState(130); condition(0);
				setState(131); match(PAR_R);
				}
				break;
			case NUMBER:
			case FLOTANTE:
			case BOOLEANO:
			case ID:
				{
				setState(133); date();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(136);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(137); match(MAY_Q);
						setState(138); condition(8);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(139);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(140); match(MEN_Q);
						setState(141); condition(7);
						}
						break;
					case 3:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(142);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(143); match(IGUAL);
						setState(144); condition(6);
						}
						break;
					case 4:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(145);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(146); match(AND);
						setState(147); condition(5);
						}
						break;
					case 5:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(148);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(149); match(OR);
						setState(150); condition(4);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode KEY_L() { return getToken(SimpleParser.KEY_L, 0); }
		public List<SentencesContext> sentences() {
			return getRuleContexts(SentencesContext.class);
		}
		public SentencesContext sentences(int i) {
			return getRuleContext(SentencesContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(SimpleParser.WHILE, 0); }
		public TerminalNode KEY_R() { return getToken(SimpleParser.KEY_R, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ENDWH() { return getToken(SimpleParser.ENDWH, 0); }
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
		enterRule(_localctx, 18, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(WHILE);
			setState(157); condition(0);
			setState(158); match(KEY_L);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << READ) | (1L << WRITTE) | (1L << ID))) != 0)) {
				{
				{
				setState(159); sentences();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165); match(KEY_R);
			setState(166); match(ENDWH);
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
		public TerminalNode KEY_L() { return getToken(SimpleParser.KEY_L, 0); }
		public List<SentencesContext> sentences() {
			return getRuleContexts(SentencesContext.class);
		}
		public SentencesContext sentences(int i) {
			return getRuleContext(SentencesContext.class,i);
		}
		public TerminalNode ENDFOR() { return getToken(SimpleParser.ENDFOR, 0); }
		public List<TerminalNode> DELIM() { return getTokens(SimpleParser.DELIM); }
		public TerminalNode PAR_R() { return getToken(SimpleParser.PAR_R, 0); }
		public TerminalNode FOR() { return getToken(SimpleParser.FOR, 0); }
		public TerminalNode DELIM(int i) {
			return getToken(SimpleParser.DELIM, i);
		}
		public TerminalNode PAR_L() { return getToken(SimpleParser.PAR_L, 0); }
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public TerminalNode KEY_R() { return getToken(SimpleParser.KEY_R, 0); }
		public DeclaContext decla() {
			return getRuleContext(DeclaContext.class,0);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
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
		enterRule(_localctx, 20, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(FOR);
			setState(169); match(PAR_L);
			setState(170); decla();
			setState(171); match(DELIM);
			setState(172); date();
			setState(173); match(DELIM);
			setState(174); date();
			setState(175); match(PAR_R);
			setState(176); match(KEY_L);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << READ) | (1L << WRITTE) | (1L << ID))) != 0)) {
				{
				{
				setState(177); sentences();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183); match(KEY_R);
			setState(184); match(ENDFOR);
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

	public static class Writte_opContext extends ParserRuleContext {
		public TerminalNode PAR_R() { return getToken(SimpleParser.PAR_R, 0); }
		public TerminalNode PAR_L() { return getToken(SimpleParser.PAR_L, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode WRITTE() { return getToken(SimpleParser.WRITTE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Writte_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writte_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterWritte_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitWritte_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitWritte_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Writte_opContext writte_op() throws RecognitionException {
		Writte_opContext _localctx = new Writte_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_writte_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(WRITTE);
			setState(187); match(PAR_L);
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(188); operation(0);
				}
				break;
			case 2:
				{
				setState(189); condition(0);
				}
				break;
			}
			setState(192); match(PAR_R);
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

	public static class Read_opContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimpleParser.ID); }
		public TerminalNode PAR_R() { return getToken(SimpleParser.PAR_R, 0); }
		public TerminalNode PAR_L() { return getToken(SimpleParser.PAR_L, 0); }
		public TerminalNode READ() { return getToken(SimpleParser.READ, 0); }
		public TerminalNode ID(int i) {
			return getToken(SimpleParser.ID, i);
		}
		public Read_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterRead_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitRead_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitRead_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_opContext read_op() throws RecognitionException {
		Read_opContext _localctx = new Read_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_read_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(READ);
			setState(195); match(PAR_L);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(196); match(ID);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202); match(PAR_R);
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
		case 6: return operation_sempred((OperationContext)_localctx, predIndex);
		case 8: return condition_sempred((ConditionContext)_localctx, predIndex);
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
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		case 1: return precpred(_ctx, 5);
		case 2: return precpred(_ctx, 4);
		case 3: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bG\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bU\n\b\f\b\16"+
		"\bX\13\b\3\t\3\t\3\t\3\t\7\t^\n\t\f\t\16\ta\13\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\th\n\t\f\t\16\tk\13\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3\t\3\t\3\t\3\t"+
		"\7\tx\n\t\f\t\16\t{\13\t\3\t\3\t\5\t\177\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0089\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u009a\n\n\f\n\16\n\u009d\13\n\3\13\3\13\3\13\3\13\7\13"+
		"\u00a3\n\13\f\13\16\13\u00a6\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u00b5\n\f\f\f\16\f\u00b8\13\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\5\r\u00c1\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u00c8\n\16\f\16"+
		"\16\16\u00cb\13\16\3\16\3\16\3\16\2\4\16\22\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\4\3\2\f\16\4\2\t\13$$\u00dd\2\34\3\2\2\2\4,\3\2\2\2\6.\3\2"+
		"\2\2\b\60\3\2\2\2\n:\3\2\2\2\f<\3\2\2\2\16F\3\2\2\2\20Y\3\2\2\2\22\u0088"+
		"\3\2\2\2\24\u009e\3\2\2\2\26\u00aa\3\2\2\2\30\u00bc\3\2\2\2\32\u00c4\3"+
		"\2\2\2\34 \7\3\2\2\35\37\5\4\3\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2"+
		"\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\4\2\2$\3\3\2\2\2%-\5\n\6\2&-\5\f"+
		"\7\2\'-\5\20\t\2(-\5\26\f\2)-\5\24\13\2*-\5\32\16\2+-\5\30\r\2,%\3\2\2"+
		"\2,&\3\2\2\2,\'\3\2\2\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\5\3\2"+
		"\2\2./\t\2\2\2/\7\3\2\2\2\60\61\t\3\2\2\61\t\3\2\2\2\62\63\5\6\4\2\63"+
		"\64\7$\2\2\64;\3\2\2\2\65\66\5\6\4\2\66\67\7$\2\2\678\7\17\2\289\5\16"+
		"\b\29;\3\2\2\2:\62\3\2\2\2:\65\3\2\2\2;\13\3\2\2\2<=\7$\2\2=>\7\17\2\2"+
		">?\5\16\b\2?\r\3\2\2\2@A\b\b\1\2AB\7\25\2\2BC\5\16\b\2CD\7\26\2\2DG\3"+
		"\2\2\2EG\5\b\5\2F@\3\2\2\2FE\3\2\2\2GV\3\2\2\2HI\f\b\2\2IJ\7\5\2\2JU\5"+
		"\16\b\tKL\f\7\2\2LM\7\6\2\2MU\5\16\b\bNO\f\6\2\2OP\7\7\2\2PU\5\16\b\7"+
		"QR\f\5\2\2RS\7\b\2\2SU\5\16\b\6TH\3\2\2\2TK\3\2\2\2TN\3\2\2\2TQ\3\2\2"+
		"\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\17\3\2\2\2XV\3\2\2\2YZ\7\31\2\2Z[\5"+
		"\22\n\2[_\7\27\2\2\\^\5\4\3\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2"+
		"`b\3\2\2\2a_\3\2\2\2bp\7\30\2\2cd\7\33\2\2de\5\22\n\2ei\7\27\2\2fh\5\4"+
		"\3\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\30"+
		"\2\2mo\3\2\2\2nc\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q~\3\2\2\2rp\3\2"+
		"\2\2st\7\32\2\2tu\5\22\n\2uy\7\27\2\2vx\5\4\3\2wv\3\2\2\2x{\3\2\2\2yw"+
		"\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\30\2\2}\177\3\2\2\2~s\3\2\2"+
		"\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\34\2\2\u0081\21\3\2\2"+
		"\2\u0082\u0083\b\n\1\2\u0083\u0084\7\25\2\2\u0084\u0085\5\22\n\2\u0085"+
		"\u0086\7\26\2\2\u0086\u0089\3\2\2\2\u0087\u0089\5\b\5\2\u0088\u0082\3"+
		"\2\2\2\u0088\u0087\3\2\2\2\u0089\u009b\3\2\2\2\u008a\u008b\f\t\2\2\u008b"+
		"\u008c\7\20\2\2\u008c\u009a\5\22\n\n\u008d\u008e\f\b\2\2\u008e\u008f\7"+
		"\21\2\2\u008f\u009a\5\22\n\t\u0090\u0091\f\7\2\2\u0091\u0092\7\22\2\2"+
		"\u0092\u009a\5\22\n\b\u0093\u0094\f\6\2\2\u0094\u0095\7\23\2\2\u0095\u009a"+
		"\5\22\n\7\u0096\u0097\f\5\2\2\u0097\u0098\7\24\2\2\u0098\u009a\5\22\n"+
		"\6\u0099\u008a\3\2\2\2\u0099\u008d\3\2\2\2\u0099\u0090\3\2\2\2\u0099\u0093"+
		"\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\23\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7 \2\2"+
		"\u009f\u00a0\5\22\n\2\u00a0\u00a4\7\27\2\2\u00a1\u00a3\5\4\3\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\30\2\2\u00a8\u00a9\7"+
		"!\2\2\u00a9\25\3\2\2\2\u00aa\u00ab\7\35\2\2\u00ab\u00ac\7\25\2\2\u00ac"+
		"\u00ad\5\n\6\2\u00ad\u00ae\7\37\2\2\u00ae\u00af\5\b\5\2\u00af\u00b0\7"+
		"\37\2\2\u00b0\u00b1\5\b\5\2\u00b1\u00b2\7\26\2\2\u00b2\u00b6\7\27\2\2"+
		"\u00b3\u00b5\5\4\3\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\7\30\2\2\u00ba\u00bb\7\36\2\2\u00bb\27\3\2\2\2\u00bc\u00bd\7#\2"+
		"\2\u00bd\u00c0\7\25\2\2\u00be\u00c1\5\16\b\2\u00bf\u00c1\5\22\n\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\26"+
		"\2\2\u00c3\31\3\2\2\2\u00c4\u00c5\7\"\2\2\u00c5\u00c9\7\25\2\2\u00c6\u00c8"+
		"\7$\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\26"+
		"\2\2\u00cd\33\3\2\2\2\24 ,:FTV_ipy~\u0088\u0099\u009b\u00a4\u00b6\u00c0"+
		"\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}