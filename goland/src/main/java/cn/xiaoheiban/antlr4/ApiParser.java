// Generated from /Users/anqiansong/workspace/java/goctl-plugins/goland/src/main/java/cn/xiaoheiban/antlr4/ApiParser.g4 by ANTLR 4.8
package cn.xiaoheiban.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ApiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INFO=1, MAP=2, STRUCT=3, INTERFACE=4, TYPE=5, ATSERVER=6, ATDOC=7, ATHANDLER=8, 
		SERVICE=9, RETURNS=10, IMPORT=11, KEY=12, TITLE=13, DESC=14, AUTHOR=15, 
		EMAIL=16, VERSION=17, GROUP=18, JWT=19, SUMMARY=20, HANDLER=21, MIDDLEWARE=22, 
		HTTPMETHOD=23, GET=24, HEAD=25, POST=26, PUT=27, PATCH=28, DELETE=29, 
		CONNECT=30, OPTIONS=31, TRACE=32, GOTYPE=33, BOOL=34, UINT8=35, UINT16=36, 
		UINT32=37, UINT64=38, INT8=39, INT16=40, INT32=41, INT64=42, FLOAT32=43, 
		FLOAT64=44, COMPLEX64=45, COMPLEX128=46, STRING=47, INT=48, UINT=49, UINTPTR=50, 
		BYTE=51, RUNE=52, TIME=53, PATH=54, LPAREN=55, RPAREN=56, LBRACE=57, RBRACE=58, 
		LBRACK=59, RBRACK=60, DOT=61, SMICOLON=62, COMMA=63, STAR=64, BAR=65, 
		ASSIGN=66, COLON=67, NUMBER=68, HOSTVALUE=69, IDENT=70, WS=71, VALUE=72, 
		RAW_STRING=73, COMMENT=74, ERRCHAR=75;
	public static final int
		RULE_api = 0, RULE_apiBody = 1, RULE_importStatement = 2, RULE_importSpec = 3, 
		RULE_infoStatement = 4, RULE_typeStatement = 5, RULE_typeGroupSpec = 6, 
		RULE_typeGroupBody = 7, RULE_typeGroupAlias = 8, RULE_typeSingleSpec = 9, 
		RULE_typeStruct = 10, RULE_typeAlias = 11, RULE_typeFiled = 12, RULE_normalField = 13, 
		RULE_fieldType = 14, RULE_anonymousField = 15, RULE_normalFieldType = 16, 
		RULE_starFieldType = 17, RULE_mapFieldType = 18, RULE_arrayOrSliceType = 19, 
		RULE_structType = 20, RULE_objType = 21, RULE_structNameId = 22, RULE_fieldName = 23, 
		RULE_referenceId = 24, RULE_tag = 25, RULE_serviceStatement = 26, RULE_serviceServerSpec = 27, 
		RULE_serviceSpec = 28, RULE_serviceName = 29, RULE_serviceBody = 30, RULE_serviceDoc = 31, 
		RULE_serviceHandler = 32, RULE_serviceHandlerNew = 33, RULE_serviceRoute = 34, 
		RULE_httpRoute = 35, RULE_identPair = 36, RULE_handlerPair = 37, RULE_identValue = 38, 
		RULE_handlerValue = 39, RULE_importValue = 40, RULE_pair = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"api", "apiBody", "importStatement", "importSpec", "infoStatement", "typeStatement", 
			"typeGroupSpec", "typeGroupBody", "typeGroupAlias", "typeSingleSpec", 
			"typeStruct", "typeAlias", "typeFiled", "normalField", "fieldType", "anonymousField", 
			"normalFieldType", "starFieldType", "mapFieldType", "arrayOrSliceType", 
			"structType", "objType", "structNameId", "fieldName", "referenceId", 
			"tag", "serviceStatement", "serviceServerSpec", "serviceSpec", "serviceName", 
			"serviceBody", "serviceDoc", "serviceHandler", "serviceHandlerNew", "serviceRoute", 
			"httpRoute", "identPair", "handlerPair", "identValue", "handlerValue", 
			"importValue", "pair"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'info'", "'map'", "'struct'", "'interface'", "'type'", "'@server'", 
			"'@doc'", "'@handler'", "'service'", "'returns'", "'import'", null, "'title'", 
			"'desc'", "'author'", "'email'", "'version'", "'group'", "'jwt'", "'summary'", 
			"'handler'", "'middleware'", null, "'get'", "'head'", "'post'", "'put'", 
			"'patch'", "'delete'", "'connect'", "'options'", "'trace'", null, "'bool'", 
			"'uint8'", "'uint16'", "'uint32'", "'uint64'", "'int8'", "'int16'", "'int32'", 
			"'int64'", "'float32'", "'float64'", "'complex64'", "'complex128'", "'string'", 
			"'int'", "'uint'", "'uintptr'", "'byte'", "'rune'", "'time.Time'", null, 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "';'", "','", "'*'", 
			"'-'", "'='", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INFO", "MAP", "STRUCT", "INTERFACE", "TYPE", "ATSERVER", "ATDOC", 
			"ATHANDLER", "SERVICE", "RETURNS", "IMPORT", "KEY", "TITLE", "DESC", 
			"AUTHOR", "EMAIL", "VERSION", "GROUP", "JWT", "SUMMARY", "HANDLER", "MIDDLEWARE", 
			"HTTPMETHOD", "GET", "HEAD", "POST", "PUT", "PATCH", "DELETE", "CONNECT", 
			"OPTIONS", "TRACE", "GOTYPE", "BOOL", "UINT8", "UINT16", "UINT32", "UINT64", 
			"INT8", "INT16", "INT32", "INT64", "FLOAT32", "FLOAT64", "COMPLEX64", 
			"COMPLEX128", "STRING", "INT", "UINT", "UINTPTR", "BYTE", "RUNE", "TIME", 
			"PATH", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "DOT", 
			"SMICOLON", "COMMA", "STAR", "BAR", "ASSIGN", "COLON", "NUMBER", "HOSTVALUE", 
			"IDENT", "WS", "VALUE", "RAW_STRING", "COMMENT", "ERRCHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ApiParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ApiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ApiContext extends ParserRuleContext {
		public ApiBodyContext apiBody() {
			return getRuleContext(ApiBodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ApiParser.EOF, 0); }
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public InfoStatementContext infoStatement() {
			return getRuleContext(InfoStatementContext.class,0);
		}
		public ApiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_api; }
	}

	public final ApiContext api() throws RecognitionException {
		ApiContext _localctx = new ApiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_api);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORT) {
				{
				setState(84);
				importStatement();
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INFO) {
				{
				setState(87);
				infoStatement();
				}
			}

			setState(90);
			apiBody();
			setState(91);
			match(EOF);
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

	public static class ApiBodyContext extends ParserRuleContext {
		public List<TypeStatementContext> typeStatement() {
			return getRuleContexts(TypeStatementContext.class);
		}
		public TypeStatementContext typeStatement(int i) {
			return getRuleContext(TypeStatementContext.class,i);
		}
		public List<ServiceStatementContext> serviceStatement() {
			return getRuleContexts(ServiceStatementContext.class);
		}
		public ServiceStatementContext serviceStatement(int i) {
			return getRuleContext(ServiceStatementContext.class,i);
		}
		public ApiBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apiBody; }
	}

	public final ApiBodyContext apiBody() throws RecognitionException {
		ApiBodyContext _localctx = new ApiBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_apiBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << ATSERVER) | (1L << SERVICE))) != 0)) {
				{
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(93);
					typeStatement();
					}
					break;
				case ATSERVER:
				case SERVICE:
					{
					setState(94);
					serviceStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ImportStatementContext extends ParserRuleContext {
		public List<ImportSpecContext> importSpec() {
			return getRuleContexts(ImportSpecContext.class);
		}
		public ImportSpecContext importSpec(int i) {
			return getRuleContext(ImportSpecContext.class,i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				importSpec();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
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

	public static class ImportSpecContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ApiParser.IMPORT, 0); }
		public ImportValueContext importValue() {
			return getRuleContext(ImportValueContext.class,0);
		}
		public ImportSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpec; }
	}

	public final ImportSpecContext importSpec() throws RecognitionException {
		ImportSpecContext _localctx = new ImportSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IMPORT);
			setState(106);
			importValue();
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

	public static class InfoStatementContext extends ParserRuleContext {
		public TerminalNode INFO() { return getToken(ApiParser.INFO, 0); }
		public TerminalNode LPAREN() { return getToken(ApiParser.LPAREN, 0); }
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApiParser.RPAREN, 0); }
		public InfoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infoStatement; }
	}

	public final InfoStatementContext infoStatement() throws RecognitionException {
		InfoStatementContext _localctx = new InfoStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_infoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(INFO);
			setState(109);
			match(LPAREN);
			setState(110);
			pair();
			setState(111);
			match(RPAREN);
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

	public static class TypeStatementContext extends ParserRuleContext {
		public TypeSingleSpecContext typeSingleSpec() {
			return getRuleContext(TypeSingleSpecContext.class,0);
		}
		public TypeGroupSpecContext typeGroupSpec() {
			return getRuleContext(TypeGroupSpecContext.class,0);
		}
		public TypeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStatement; }
	}

	public final TypeStatementContext typeStatement() throws RecognitionException {
		TypeStatementContext _localctx = new TypeStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(113);
				typeSingleSpec();
				}
				break;
			case 2:
				{
				setState(114);
				typeGroupSpec();
				}
				break;
			}
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

	public static class TypeGroupSpecContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ApiParser.TYPE, 0); }
		public TerminalNode LPAREN() { return getToken(ApiParser.LPAREN, 0); }
		public TypeGroupBodyContext typeGroupBody() {
			return getRuleContext(TypeGroupBodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApiParser.RPAREN, 0); }
		public TypeGroupSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeGroupSpec; }
	}

	public final TypeGroupSpecContext typeGroupSpec() throws RecognitionException {
		TypeGroupSpecContext _localctx = new TypeGroupSpecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeGroupSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(TYPE);
			setState(118);
			match(LPAREN);
			setState(119);
			typeGroupBody();
			setState(120);
			match(RPAREN);
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

	public static class TypeGroupBodyContext extends ParserRuleContext {
		public List<TypeGroupAliasContext> typeGroupAlias() {
			return getRuleContexts(TypeGroupAliasContext.class);
		}
		public TypeGroupAliasContext typeGroupAlias(int i) {
			return getRuleContext(TypeGroupAliasContext.class,i);
		}
		public List<StructTypeContext> structType() {
			return getRuleContexts(StructTypeContext.class);
		}
		public StructTypeContext structType(int i) {
			return getRuleContext(StructTypeContext.class,i);
		}
		public TypeGroupBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeGroupBody; }
	}

	public final TypeGroupBodyContext typeGroupBody() throws RecognitionException {
		TypeGroupBodyContext _localctx = new TypeGroupBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeGroupBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(122);
					typeGroupAlias();
					}
					break;
				case 2:
					{
					setState(123);
					structType();
					}
					break;
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TypeGroupAliasContext extends ParserRuleContext {
		public StructNameIdContext structNameId() {
			return getRuleContext(StructNameIdContext.class,0);
		}
		public NormalFieldTypeContext normalFieldType() {
			return getRuleContext(NormalFieldTypeContext.class,0);
		}
		public TypeGroupAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeGroupAlias; }
	}

	public final TypeGroupAliasContext typeGroupAlias() throws RecognitionException {
		TypeGroupAliasContext _localctx = new TypeGroupAliasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeGroupAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			structNameId();
			setState(130);
			normalFieldType();
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

	public static class TypeSingleSpecContext extends ParserRuleContext {
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public TypeStructContext typeStruct() {
			return getRuleContext(TypeStructContext.class,0);
		}
		public TypeSingleSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSingleSpec; }
	}

	public final TypeSingleSpecContext typeSingleSpec() throws RecognitionException {
		TypeSingleSpecContext _localctx = new TypeSingleSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeSingleSpec);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				typeAlias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				typeStruct();
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

	public static class TypeStructContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ApiParser.TYPE, 0); }
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public TypeStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStruct; }
	}

	public final TypeStructContext typeStruct() throws RecognitionException {
		TypeStructContext _localctx = new TypeStructContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(TYPE);
			setState(137);
			structType();
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

	public static class TypeAliasContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ApiParser.TYPE, 0); }
		public StructNameIdContext structNameId() {
			return getRuleContext(StructNameIdContext.class,0);
		}
		public NormalFieldTypeContext normalFieldType() {
			return getRuleContext(NormalFieldTypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ApiParser.ASSIGN, 0); }
		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAlias; }
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(TYPE);
			setState(140);
			structNameId();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(141);
				match(ASSIGN);
				}
			}

			setState(144);
			normalFieldType();
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

	public static class TypeFiledContext extends ParserRuleContext {
		public AnonymousFieldContext anonymousField() {
			return getRuleContext(AnonymousFieldContext.class,0);
		}
		public NormalFieldContext normalField() {
			return getRuleContext(NormalFieldContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public TypeFiledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFiled; }
	}

	public final TypeFiledContext typeFiled() throws RecognitionException {
		TypeFiledContext _localctx = new TypeFiledContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeFiled);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				anonymousField();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				normalField();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				structType();
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

	public static class NormalFieldContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public NormalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalField; }
	}

	public final NormalFieldContext normalField() throws RecognitionException {
		NormalFieldContext _localctx = new NormalFieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_normalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			fieldName();
			setState(152);
			fieldType();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RAW_STRING) {
				{
				setState(153);
				tag();
				}
			}

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

	public static class FieldTypeContext extends ParserRuleContext {
		public NormalFieldTypeContext normalFieldType() {
			return getRuleContext(NormalFieldTypeContext.class,0);
		}
		public StarFieldTypeContext starFieldType() {
			return getRuleContext(StarFieldTypeContext.class,0);
		}
		public MapFieldTypeContext mapFieldType() {
			return getRuleContext(MapFieldTypeContext.class,0);
		}
		public ArrayOrSliceTypeContext arrayOrSliceType() {
			return getRuleContext(ArrayOrSliceTypeContext.class,0);
		}
		public FieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldType; }
	}

	public final FieldTypeContext fieldType() throws RecognitionException {
		FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fieldType);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERFACE:
			case GOTYPE:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				normalFieldType();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				starFieldType();
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				mapFieldType();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				arrayOrSliceType();
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

	public static class AnonymousFieldContext extends ParserRuleContext {
		public ReferenceIdContext referenceId() {
			return getRuleContext(ReferenceIdContext.class,0);
		}
		public TerminalNode STAR() { return getToken(ApiParser.STAR, 0); }
		public AnonymousFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousField; }
	}

	public final AnonymousFieldContext anonymousField() throws RecognitionException {
		AnonymousFieldContext _localctx = new AnonymousFieldContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_anonymousField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(162);
				match(STAR);
				}
			}

			setState(165);
			referenceId();
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

	public static class NormalFieldTypeContext extends ParserRuleContext {
		public TerminalNode GOTYPE() { return getToken(ApiParser.GOTYPE, 0); }
		public ReferenceIdContext referenceId() {
			return getRuleContext(ReferenceIdContext.class,0);
		}
		public TerminalNode INTERFACE() { return getToken(ApiParser.INTERFACE, 0); }
		public TerminalNode LBRACE() { return getToken(ApiParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApiParser.RBRACE, 0); }
		public NormalFieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalFieldType; }
	}

	public final NormalFieldTypeContext normalFieldType() throws RecognitionException {
		NormalFieldTypeContext _localctx = new NormalFieldTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_normalFieldType);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(GOTYPE);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				referenceId();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(169);
				match(INTERFACE);
				setState(170);
				match(LBRACE);
				setState(171);
				match(RBRACE);
				}
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

	public static class StarFieldTypeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(ApiParser.STAR, 0); }
		public NormalFieldTypeContext normalFieldType() {
			return getRuleContext(NormalFieldTypeContext.class,0);
		}
		public StarFieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starFieldType; }
	}

	public final StarFieldTypeContext starFieldType() throws RecognitionException {
		StarFieldTypeContext _localctx = new StarFieldTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_starFieldType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(STAR);
			setState(175);
			normalFieldType();
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

	public static class MapFieldTypeContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(ApiParser.MAP, 0); }
		public TerminalNode LBRACK() { return getToken(ApiParser.LBRACK, 0); }
		public TerminalNode GOTYPE() { return getToken(ApiParser.GOTYPE, 0); }
		public TerminalNode RBRACK() { return getToken(ApiParser.RBRACK, 0); }
		public ObjTypeContext objType() {
			return getRuleContext(ObjTypeContext.class,0);
		}
		public MapFieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapFieldType; }
	}

	public final MapFieldTypeContext mapFieldType() throws RecognitionException {
		MapFieldTypeContext _localctx = new MapFieldTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mapFieldType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(MAP);
			setState(178);
			match(LBRACK);
			setState(179);
			match(GOTYPE);
			setState(180);
			match(RBRACK);
			setState(181);
			objType();
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

	public static class ArrayOrSliceTypeContext extends ParserRuleContext {
		public ObjTypeContext objType() {
			return getRuleContext(ObjTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ApiParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ApiParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ApiParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ApiParser.RBRACK, i);
		}
		public ArrayOrSliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOrSliceType; }
	}

	public final ArrayOrSliceTypeContext arrayOrSliceType() throws RecognitionException {
		ArrayOrSliceTypeContext _localctx = new ArrayOrSliceTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayOrSliceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				match(LBRACK);
				setState(184);
				match(RBRACK);
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACK );
			setState(189);
			objType();
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

	public static class StructTypeContext extends ParserRuleContext {
		public StructNameIdContext structNameId() {
			return getRuleContext(StructNameIdContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ApiParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApiParser.RBRACE, 0); }
		public TerminalNode STRUCT() { return getToken(ApiParser.STRUCT, 0); }
		public List<TypeFiledContext> typeFiled() {
			return getRuleContexts(TypeFiledContext.class);
		}
		public TypeFiledContext typeFiled(int i) {
			return getRuleContext(TypeFiledContext.class,i);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_structType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			structNameId();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRUCT) {
				{
				setState(192);
				match(STRUCT);
				}
			}

			setState(195);
			match(LBRACE);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==IDENT) {
				{
				{
				setState(196);
				typeFiled();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(RBRACE);
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

	public static class ObjTypeContext extends ParserRuleContext {
		public NormalFieldTypeContext normalFieldType() {
			return getRuleContext(NormalFieldTypeContext.class,0);
		}
		public StarFieldTypeContext starFieldType() {
			return getRuleContext(StarFieldTypeContext.class,0);
		}
		public ObjTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objType; }
	}

	public final ObjTypeContext objType() throws RecognitionException {
		ObjTypeContext _localctx = new ObjTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_objType);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERFACE:
			case GOTYPE:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				normalFieldType();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				starFieldType();
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

	public static class StructNameIdContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ApiParser.IDENT, 0); }
		public StructNameIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structNameId; }
	}

	public final StructNameIdContext structNameId() throws RecognitionException {
		StructNameIdContext _localctx = new StructNameIdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_structNameId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(IDENT);
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

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ApiParser.IDENT, 0); }
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IDENT);
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

	public static class ReferenceIdContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ApiParser.IDENT, 0); }
		public ReferenceIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceId; }
	}

	public final ReferenceIdContext referenceId() throws RecognitionException {
		ReferenceIdContext _localctx = new ReferenceIdContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_referenceId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(IDENT);
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

	public static class TagContext extends ParserRuleContext {
		public TerminalNode RAW_STRING() { return getToken(ApiParser.RAW_STRING, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(RAW_STRING);
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

	public static class ServiceStatementContext extends ParserRuleContext {
		public ServiceSpecContext serviceSpec() {
			return getRuleContext(ServiceSpecContext.class,0);
		}
		public ServiceServerSpecContext serviceServerSpec() {
			return getRuleContext(ServiceServerSpecContext.class,0);
		}
		public ServiceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceStatement; }
	}

	public final ServiceStatementContext serviceStatement() throws RecognitionException {
		ServiceStatementContext _localctx = new ServiceStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_serviceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATSERVER) {
				{
				setState(216);
				serviceServerSpec();
				}
			}

			setState(219);
			serviceSpec();
			}
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

	public static class ServiceServerSpecContext extends ParserRuleContext {
		public TerminalNode ATSERVER() { return getToken(ApiParser.ATSERVER, 0); }
		public TerminalNode LPAREN() { return getToken(ApiParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ApiParser.RPAREN, 0); }
		public List<IdentPairContext> identPair() {
			return getRuleContexts(IdentPairContext.class);
		}
		public IdentPairContext identPair(int i) {
			return getRuleContext(IdentPairContext.class,i);
		}
		public ServiceServerSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceServerSpec; }
	}

	public final ServiceServerSpecContext serviceServerSpec() throws RecognitionException {
		ServiceServerSpecContext _localctx = new ServiceServerSpecContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_serviceServerSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ATSERVER);
			setState(222);
			match(LPAREN);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEY) {
				{
				{
				setState(223);
				identPair();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(RPAREN);
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

	public static class ServiceSpecContext extends ParserRuleContext {
		public TerminalNode SERVICE() { return getToken(ApiParser.SERVICE, 0); }
		public ServiceNameContext serviceName() {
			return getRuleContext(ServiceNameContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ApiParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApiParser.RBRACE, 0); }
		public List<ServiceBodyContext> serviceBody() {
			return getRuleContexts(ServiceBodyContext.class);
		}
		public ServiceBodyContext serviceBody(int i) {
			return getRuleContext(ServiceBodyContext.class,i);
		}
		public ServiceSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceSpec; }
	}

	public final ServiceSpecContext serviceSpec() throws RecognitionException {
		ServiceSpecContext _localctx = new ServiceSpecContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_serviceSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(SERVICE);
			setState(232);
			serviceName();
			setState(233);
			match(LBRACE);
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				serviceBody();
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATSERVER) | (1L << ATDOC) | (1L << ATHANDLER))) != 0) );
			setState(239);
			match(RBRACE);
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

	public static class ServiceNameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ApiParser.IDENT, 0); }
		public ServiceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceName; }
	}

	public final ServiceNameContext serviceName() throws RecognitionException {
		ServiceNameContext _localctx = new ServiceNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_serviceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(IDENT);
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

	public static class ServiceBodyContext extends ParserRuleContext {
		public ServiceRouteContext serviceRoute() {
			return getRuleContext(ServiceRouteContext.class,0);
		}
		public ServiceHandlerContext serviceHandler() {
			return getRuleContext(ServiceHandlerContext.class,0);
		}
		public ServiceHandlerNewContext serviceHandlerNew() {
			return getRuleContext(ServiceHandlerNewContext.class,0);
		}
		public ServiceDocContext serviceDoc() {
			return getRuleContext(ServiceDocContext.class,0);
		}
		public ServiceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceBody; }
	}

	public final ServiceBodyContext serviceBody() throws RecognitionException {
		ServiceBodyContext _localctx = new ServiceBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_serviceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATDOC) {
				{
				setState(243);
				serviceDoc();
				}
			}

			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATSERVER:
				{
				setState(246);
				serviceHandler();
				}
				break;
			case ATHANDLER:
				{
				setState(247);
				serviceHandlerNew();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(250);
			serviceRoute();
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

	public static class ServiceDocContext extends ParserRuleContext {
		public TerminalNode ATDOC() { return getToken(ApiParser.ATDOC, 0); }
		public TerminalNode LPAREN() { return getToken(ApiParser.LPAREN, 0); }
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApiParser.RPAREN, 0); }
		public ServiceDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceDoc; }
	}

	public final ServiceDocContext serviceDoc() throws RecognitionException {
		ServiceDocContext _localctx = new ServiceDocContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_serviceDoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(ATDOC);
			setState(253);
			match(LPAREN);
			setState(254);
			pair();
			setState(255);
			match(RPAREN);
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

	public static class ServiceHandlerContext extends ParserRuleContext {
		public TerminalNode ATSERVER() { return getToken(ApiParser.ATSERVER, 0); }
		public TerminalNode LPAREN() { return getToken(ApiParser.LPAREN, 0); }
		public HandlerPairContext handlerPair() {
			return getRuleContext(HandlerPairContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ApiParser.RPAREN, 0); }
		public ServiceHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceHandler; }
	}

	public final ServiceHandlerContext serviceHandler() throws RecognitionException {
		ServiceHandlerContext _localctx = new ServiceHandlerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_serviceHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(ATSERVER);
			setState(258);
			match(LPAREN);
			setState(259);
			handlerPair();
			setState(260);
			match(RPAREN);
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

	public static class ServiceHandlerNewContext extends ParserRuleContext {
		public TerminalNode ATHANDLER() { return getToken(ApiParser.ATHANDLER, 0); }
		public HandlerValueContext handlerValue() {
			return getRuleContext(HandlerValueContext.class,0);
		}
		public ServiceHandlerNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceHandlerNew; }
	}

	public final ServiceHandlerNewContext serviceHandlerNew() throws RecognitionException {
		ServiceHandlerNewContext _localctx = new ServiceHandlerNewContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_serviceHandlerNew);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ATHANDLER);
			setState(263);
			handlerValue();
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

	public static class ServiceRouteContext extends ParserRuleContext {
		public HttpRouteContext httpRoute() {
			return getRuleContext(HttpRouteContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ApiParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ApiParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ApiParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ApiParser.RPAREN, i);
		}
		public List<ReferenceIdContext> referenceId() {
			return getRuleContexts(ReferenceIdContext.class);
		}
		public ReferenceIdContext referenceId(int i) {
			return getRuleContext(ReferenceIdContext.class,i);
		}
		public TerminalNode RETURNS() { return getToken(ApiParser.RETURNS, 0); }
		public TerminalNode SMICOLON() { return getToken(ApiParser.SMICOLON, 0); }
		public ServiceRouteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceRoute; }
	}

	public final ServiceRouteContext serviceRoute() throws RecognitionException {
		ServiceRouteContext _localctx = new ServiceRouteContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_serviceRoute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			httpRoute();
			setState(266);
			match(LPAREN);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(267);
				referenceId();
				}
			}

			setState(270);
			match(RPAREN);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(271);
				match(RETURNS);
				setState(272);
				match(LPAREN);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(273);
					referenceId();
					}
				}

				setState(276);
				match(RPAREN);
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMICOLON) {
				{
				setState(279);
				match(SMICOLON);
				}
			}

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

	public static class HttpRouteContext extends ParserRuleContext {
		public TerminalNode HTTPMETHOD() { return getToken(ApiParser.HTTPMETHOD, 0); }
		public TerminalNode PATH() { return getToken(ApiParser.PATH, 0); }
		public HttpRouteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpRoute; }
	}

	public final HttpRouteContext httpRoute() throws RecognitionException {
		HttpRouteContext _localctx = new HttpRouteContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_httpRoute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(HTTPMETHOD);
			setState(283);
			match(PATH);
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

	public static class IdentPairContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(ApiParser.KEY, 0); }
		public TerminalNode COLON() { return getToken(ApiParser.COLON, 0); }
		public IdentValueContext identValue() {
			return getRuleContext(IdentValueContext.class,0);
		}
		public IdentPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identPair; }
	}

	public final IdentPairContext identPair() throws RecognitionException {
		IdentPairContext _localctx = new IdentPairContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_identPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(KEY);
			setState(286);
			match(COLON);
			setState(287);
			identValue();
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

	public static class HandlerPairContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(ApiParser.KEY, 0); }
		public TerminalNode COLON() { return getToken(ApiParser.COLON, 0); }
		public HandlerValueContext handlerValue() {
			return getRuleContext(HandlerValueContext.class,0);
		}
		public HandlerPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerPair; }
	}

	public final HandlerPairContext handlerPair() throws RecognitionException {
		HandlerPairContext _localctx = new HandlerPairContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_handlerPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(KEY);
			setState(290);
			match(COLON);
			setState(291);
			handlerValue();
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

	public static class IdentValueContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(ApiParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ApiParser.IDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ApiParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ApiParser.COMMA, i);
		}
		public IdentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identValue; }
	}

	public final IdentValueContext identValue() throws RecognitionException {
		IdentValueContext _localctx = new IdentValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_identValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293);
				match(IDENT);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(294);
					match(COMMA);
					}
				}

				}
				}
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class HandlerValueContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ApiParser.IDENT, 0); }
		public HandlerValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerValue; }
	}

	public final HandlerValueContext handlerValue() throws RecognitionException {
		HandlerValueContext _localctx = new HandlerValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_handlerValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(IDENT);
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

	public static class ImportValueContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(ApiParser.VALUE, 0); }
		public ImportValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importValue; }
	}

	public final ImportValueContext importValue() throws RecognitionException {
		ImportValueContext _localctx = new ImportValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_importValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(VALUE);
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

	public static class PairContext extends ParserRuleContext {
		public List<TerminalNode> KEY() { return getTokens(ApiParser.KEY); }
		public TerminalNode KEY(int i) {
			return getToken(ApiParser.KEY, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ApiParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ApiParser.COLON, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(ApiParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(ApiParser.VALUE, i);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEY) {
				{
				{
				setState(305);
				match(KEY);
				setState(306);
				match(COLON);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE) {
					{
					setState(307);
					match(VALUE);
					}
				}

				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3M\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\5\2X\n\2\3\2\5\2[\n\2\3\2\3\2\3\2\3\3\3\3\7\3b\n\3\f\3\16\3e\13\3\3"+
		"\4\6\4h\n\4\r\4\16\4i\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7v\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082\13\t\3\n\3\n\3"+
		"\n\3\13\3\13\5\13\u0089\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u0091\n\r\3\r"+
		"\3\r\3\16\3\16\3\16\5\16\u0098\n\16\3\17\3\17\3\17\5\17\u009d\n\17\3\20"+
		"\3\20\3\20\3\20\5\20\u00a3\n\20\3\21\5\21\u00a6\n\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00af\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\6\25\u00bc\n\25\r\25\16\25\u00bd\3\25\3\25\3\26\3"+
		"\26\5\26\u00c4\n\26\3\26\3\26\7\26\u00c8\n\26\f\26\16\26\u00cb\13\26\3"+
		"\26\3\26\3\27\3\27\5\27\u00d1\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\5\34\u00dc\n\34\3\34\3\34\3\35\3\35\3\35\7\35\u00e3\n\35\f"+
		"\35\16\35\u00e6\13\35\3\35\3\35\3\36\3\36\3\36\3\36\6\36\u00ee\n\36\r"+
		"\36\16\36\u00ef\3\36\3\36\3\37\3\37\3 \5 \u00f7\n \3 \3 \5 \u00fb\n \3"+
		" \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\5$\u010f\n$"+
		"\3$\3$\3$\3$\5$\u0115\n$\3$\5$\u0118\n$\3$\5$\u011b\n$\3%\3%\3%\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3(\3(\5(\u012a\n(\6(\u012c\n(\r(\16(\u012d\3)\3"+
		")\3*\3*\3+\3+\3+\5+\u0137\n+\7+\u0139\n+\f+\16+\u013c\13+\3+\2\2,\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RT\2\2\2\u0137\2W\3\2\2\2\4c\3\2\2\2\6g\3\2\2\2\bk\3\2\2\2\nn\3\2\2\2"+
		"\fu\3\2\2\2\16w\3\2\2\2\20\u0080\3\2\2\2\22\u0083\3\2\2\2\24\u0088\3\2"+
		"\2\2\26\u008a\3\2\2\2\30\u008d\3\2\2\2\32\u0097\3\2\2\2\34\u0099\3\2\2"+
		"\2\36\u00a2\3\2\2\2 \u00a5\3\2\2\2\"\u00ae\3\2\2\2$\u00b0\3\2\2\2&\u00b3"+
		"\3\2\2\2(\u00bb\3\2\2\2*\u00c1\3\2\2\2,\u00d0\3\2\2\2.\u00d2\3\2\2\2\60"+
		"\u00d4\3\2\2\2\62\u00d6\3\2\2\2\64\u00d8\3\2\2\2\66\u00db\3\2\2\28\u00df"+
		"\3\2\2\2:\u00e9\3\2\2\2<\u00f3\3\2\2\2>\u00f6\3\2\2\2@\u00fe\3\2\2\2B"+
		"\u0103\3\2\2\2D\u0108\3\2\2\2F\u010b\3\2\2\2H\u011c\3\2\2\2J\u011f\3\2"+
		"\2\2L\u0123\3\2\2\2N\u012b\3\2\2\2P\u012f\3\2\2\2R\u0131\3\2\2\2T\u013a"+
		"\3\2\2\2VX\5\6\4\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\5\n\6\2ZY\3\2\2\2Z"+
		"[\3\2\2\2[\\\3\2\2\2\\]\5\4\3\2]^\7\2\2\3^\3\3\2\2\2_b\5\f\7\2`b\5\66"+
		"\34\2a_\3\2\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\5\3\2\2\2ec\3"+
		"\2\2\2fh\5\b\5\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\7\3\2\2\2kl"+
		"\7\r\2\2lm\5R*\2m\t\3\2\2\2no\7\3\2\2op\79\2\2pq\5T+\2qr\7:\2\2r\13\3"+
		"\2\2\2sv\5\24\13\2tv\5\16\b\2us\3\2\2\2ut\3\2\2\2v\r\3\2\2\2wx\7\7\2\2"+
		"xy\79\2\2yz\5\20\t\2z{\7:\2\2{\17\3\2\2\2|\177\5\22\n\2}\177\5*\26\2~"+
		"|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\21\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\5.\30\2\u0084\u0085"+
		"\5\"\22\2\u0085\23\3\2\2\2\u0086\u0089\5\30\r\2\u0087\u0089\5\26\f\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\25\3\2\2\2\u008a\u008b\7\7\2"+
		"\2\u008b\u008c\5*\26\2\u008c\27\3\2\2\2\u008d\u008e\7\7\2\2\u008e\u0090"+
		"\5.\30\2\u008f\u0091\7D\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\5\"\22\2\u0093\31\3\2\2\2\u0094\u0098\5 \21"+
		"\2\u0095\u0098\5\34\17\2\u0096\u0098\5*\26\2\u0097\u0094\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\33\3\2\2\2\u0099\u009a\5\60\31"+
		"\2\u009a\u009c\5\36\20\2\u009b\u009d\5\64\33\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\35\3\2\2\2\u009e\u00a3\5\"\22\2\u009f\u00a3\5$\23"+
		"\2\u00a0\u00a3\5&\24\2\u00a1\u00a3\5(\25\2\u00a2\u009e\3\2\2\2\u00a2\u009f"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\37\3\2\2\2\u00a4"+
		"\u00a6\7B\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\5\62\32\2\u00a8!\3\2\2\2\u00a9\u00af\7#\2\2\u00aa\u00af"+
		"\5\62\32\2\u00ab\u00ac\7\6\2\2\u00ac\u00ad\7;\2\2\u00ad\u00af\7<\2\2\u00ae"+
		"\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af#\3\2\2\2"+
		"\u00b0\u00b1\7B\2\2\u00b1\u00b2\5\"\22\2\u00b2%\3\2\2\2\u00b3\u00b4\7"+
		"\4\2\2\u00b4\u00b5\7=\2\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\7>\2\2\u00b7"+
		"\u00b8\5,\27\2\u00b8\'\3\2\2\2\u00b9\u00ba\7=\2\2\u00ba\u00bc\7>\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\5,\27\2\u00c0)\3\2\2\2\u00c1\u00c3"+
		"\5.\30\2\u00c2\u00c4\7\5\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c9\7;\2\2\u00c6\u00c8\5\32\16\2\u00c7\u00c6\3"+
		"\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7<\2\2\u00cd+\3\2\2\2\u00ce"+
		"\u00d1\5\"\22\2\u00cf\u00d1\5$\23\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1-\3\2\2\2\u00d2\u00d3\7H\2\2\u00d3/\3\2\2\2\u00d4\u00d5\7"+
		"H\2\2\u00d5\61\3\2\2\2\u00d6\u00d7\7H\2\2\u00d7\63\3\2\2\2\u00d8\u00d9"+
		"\7K\2\2\u00d9\65\3\2\2\2\u00da\u00dc\58\35\2\u00db\u00da\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\5:\36\2\u00de\67\3\2\2"+
		"\2\u00df\u00e0\7\b\2\2\u00e0\u00e4\79\2\2\u00e1\u00e3\5J&\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7:\2\2\u00e89\3\2\2\2\u00e9"+
		"\u00ea\7\13\2\2\u00ea\u00eb\5<\37\2\u00eb\u00ed\7;\2\2\u00ec\u00ee\5>"+
		" \2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7<\2\2\u00f2;\3\2\2\2\u00f3"+
		"\u00f4\7H\2\2\u00f4=\3\2\2\2\u00f5\u00f7\5@!\2\u00f6\u00f5\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00fb\5B\"\2\u00f9\u00fb\5D#"+
		"\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd"+
		"\5F$\2\u00fd?\3\2\2\2\u00fe\u00ff\7\t\2\2\u00ff\u0100\79\2\2\u0100\u0101"+
		"\5T+\2\u0101\u0102\7:\2\2\u0102A\3\2\2\2\u0103\u0104\7\b\2\2\u0104\u0105"+
		"\79\2\2\u0105\u0106\5L\'\2\u0106\u0107\7:\2\2\u0107C\3\2\2\2\u0108\u0109"+
		"\7\n\2\2\u0109\u010a\5P)\2\u010aE\3\2\2\2\u010b\u010c\5H%\2\u010c\u010e"+
		"\79\2\2\u010d\u010f\5\62\32\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2"+
		"\u010f\u0110\3\2\2\2\u0110\u0117\7:\2\2\u0111\u0112\7\f\2\2\u0112\u0114"+
		"\79\2\2\u0113\u0115\5\62\32\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u0118\7:\2\2\u0117\u0111\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u011b\7@\2\2\u011a\u0119\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011bG\3\2\2\2\u011c\u011d\7\31\2\2\u011d\u011e\78\2\2"+
		"\u011eI\3\2\2\2\u011f\u0120\7\16\2\2\u0120\u0121\7E\2\2\u0121\u0122\5"+
		"N(\2\u0122K\3\2\2\2\u0123\u0124\7\16\2\2\u0124\u0125\7E\2\2\u0125\u0126"+
		"\5P)\2\u0126M\3\2\2\2\u0127\u0129\7H\2\2\u0128\u012a\7A\2\2\u0129\u0128"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0127\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012eO\3\2\2\2"+
		"\u012f\u0130\7H\2\2\u0130Q\3\2\2\2\u0131\u0132\7J\2\2\u0132S\3\2\2\2\u0133"+
		"\u0134\7\16\2\2\u0134\u0136\7E\2\2\u0135\u0137\7J\2\2\u0136\u0135\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0133\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bU\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\"WZaciu~\u0080\u0088\u0090\u0097\u009c\u00a2\u00a5"+
		"\u00ae\u00bd\u00c3\u00c9\u00d0\u00db\u00e4\u00ef\u00f6\u00fa\u010e\u0114"+
		"\u0117\u011a\u0129\u012d\u0136\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}