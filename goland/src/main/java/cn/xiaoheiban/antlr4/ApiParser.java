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
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << ATSERVER) | (1L << SERVICE))) != 0)) {
				{
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(92);
					typeStatement();
					}
					break;
				case ATSERVER:
				case SERVICE:
					{
					setState(93);
					serviceStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(98);
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
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				importSpec();
				}
				}
				setState(102); 
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
			setState(104);
			match(IMPORT);
			setState(105);
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
			setState(107);
			match(INFO);
			setState(108);
			match(LPAREN);
			setState(109);
			pair();
			setState(110);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(112);
				typeSingleSpec();
				}
				break;
			case 2:
				{
				setState(113);
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
			setState(116);
			match(TYPE);
			setState(117);
			match(LPAREN);
			setState(118);
			typeGroupBody();
			setState(119);
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(121);
					typeGroupAlias();
					}
					break;
				case 2:
					{
					setState(122);
					structType();
					}
					break;
				}
				}
				setState(127);
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
			setState(128);
			structNameId();
			setState(129);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				typeAlias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
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
			setState(135);
			match(TYPE);
			setState(136);
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
			setState(138);
			match(TYPE);
			setState(139);
			structNameId();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(140);
				match(ASSIGN);
				}
			}

			setState(143);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				anonymousField();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				normalField();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
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
			setState(150);
			fieldName();
			setState(151);
			fieldType();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RAW_STRING) {
				{
				setState(152);
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERFACE:
			case GOTYPE:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				normalFieldType();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				starFieldType();
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				mapFieldType();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
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
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(161);
				match(STAR);
				}
			}

			setState(164);
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
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(GOTYPE);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				referenceId();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(168);
				match(INTERFACE);
				setState(169);
				match(LBRACE);
				setState(170);
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
			setState(173);
			match(STAR);
			setState(174);
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
			setState(176);
			match(MAP);
			setState(177);
			match(LBRACK);
			setState(178);
			match(GOTYPE);
			setState(179);
			match(RBRACK);
			setState(180);
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
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				match(LBRACK);
				setState(183);
				match(RBRACK);
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACK );
			setState(188);
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
		public TerminalNode STRUCT() { return getToken(ApiParser.STRUCT, 0); }
		public TerminalNode LBRACE() { return getToken(ApiParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ApiParser.RBRACE, 0); }
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
			setState(190);
			structNameId();
			setState(191);
			match(STRUCT);
			setState(192);
			match(LBRACE);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==IDENT) {
				{
				{
				setState(193);
				typeFiled();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
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
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERFACE:
			case GOTYPE:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				normalFieldType();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
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
			setState(205);
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
			setState(207);
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
			setState(209);
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
			setState(211);
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
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATSERVER) {
				{
				setState(213);
				serviceServerSpec();
				}
			}

			setState(216);
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
			setState(218);
			match(ATSERVER);
			setState(219);
			match(LPAREN);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEY) {
				{
				{
				setState(220);
				identPair();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
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
			setState(228);
			match(SERVICE);
			setState(229);
			serviceName();
			setState(230);
			match(LBRACE);
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				serviceBody();
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATSERVER) | (1L << ATDOC) | (1L << ATHANDLER))) != 0) );
			setState(236);
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
			setState(238);
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
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATDOC) {
				{
				setState(240);
				serviceDoc();
				}
			}

			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATSERVER:
				{
				setState(243);
				serviceHandler();
				}
				break;
			case ATHANDLER:
				{
				setState(244);
				serviceHandlerNew();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(247);
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
			setState(249);
			match(ATDOC);
			setState(250);
			match(LPAREN);
			setState(251);
			pair();
			setState(252);
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
			setState(254);
			match(ATSERVER);
			setState(255);
			match(LPAREN);
			setState(256);
			handlerPair();
			setState(257);
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
			setState(259);
			match(ATHANDLER);
			setState(260);
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
			setState(262);
			httpRoute();
			setState(263);
			match(LPAREN);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(264);
				referenceId();
				}
			}

			setState(267);
			match(RPAREN);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(268);
				match(RETURNS);
				setState(269);
				match(LPAREN);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(270);
					referenceId();
					}
				}

				setState(273);
				match(RPAREN);
				}
			}

			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SMICOLON) {
				{
				setState(276);
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
			setState(279);
			match(HTTPMETHOD);
			setState(280);
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
			setState(282);
			match(KEY);
			setState(283);
			match(COLON);
			setState(284);
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
			setState(286);
			match(KEY);
			setState(287);
			match(COLON);
			setState(288);
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
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(290);
				match(IDENT);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(291);
					match(COMMA);
					}
				}

				}
				}
				setState(296); 
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
			setState(298);
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
			setState(300);
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
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEY) {
				{
				{
				setState(302);
				match(KEY);
				setState(303);
				match(COLON);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE) {
					{
					setState(304);
					match(VALUE);
					}
				}

				}
				}
				setState(311);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3M\u013b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\5\2X\n\2\3\2\5\2[\n\2\3\2\3\2\3\3\3\3\7\3a\n\3\f\3\16\3d\13\3\3\4\6"+
		"\4g\n\4\r\4\16\4h\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7u\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\7\t~\n\t\f\t\16\t\u0081\13\t\3\n\3\n\3\n\3\13"+
		"\3\13\5\13\u0088\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u0090\n\r\3\r\3\r\3"+
		"\16\3\16\3\16\5\16\u0097\n\16\3\17\3\17\3\17\5\17\u009c\n\17\3\20\3\20"+
		"\3\20\3\20\5\20\u00a2\n\20\3\21\5\21\u00a5\n\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00ae\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\6\25\u00bb\n\25\r\25\16\25\u00bc\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\7\26\u00c5\n\26\f\26\16\26\u00c8\13\26\3\26\3\26\3\27\3\27\5"+
		"\27\u00ce\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\5\34\u00d9"+
		"\n\34\3\34\3\34\3\35\3\35\3\35\7\35\u00e0\n\35\f\35\16\35\u00e3\13\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\6\36\u00eb\n\36\r\36\16\36\u00ec\3\36\3"+
		"\36\3\37\3\37\3 \5 \u00f4\n \3 \3 \5 \u00f8\n \3 \3 \3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\5$\u010c\n$\3$\3$\3$\3$\5$\u0112"+
		"\n$\3$\5$\u0115\n$\3$\5$\u0118\n$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3(\3(\5(\u0127\n(\6(\u0129\n(\r(\16(\u012a\3)\3)\3*\3*\3+\3+\3+\5+\u0134"+
		"\n+\7+\u0136\n+\f+\16+\u0139\13+\3+\2\2,\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\2\2\u0133\2W\3\2\2\2\4"+
		"b\3\2\2\2\6f\3\2\2\2\bj\3\2\2\2\nm\3\2\2\2\ft\3\2\2\2\16v\3\2\2\2\20\177"+
		"\3\2\2\2\22\u0082\3\2\2\2\24\u0087\3\2\2\2\26\u0089\3\2\2\2\30\u008c\3"+
		"\2\2\2\32\u0096\3\2\2\2\34\u0098\3\2\2\2\36\u00a1\3\2\2\2 \u00a4\3\2\2"+
		"\2\"\u00ad\3\2\2\2$\u00af\3\2\2\2&\u00b2\3\2\2\2(\u00ba\3\2\2\2*\u00c0"+
		"\3\2\2\2,\u00cd\3\2\2\2.\u00cf\3\2\2\2\60\u00d1\3\2\2\2\62\u00d3\3\2\2"+
		"\2\64\u00d5\3\2\2\2\66\u00d8\3\2\2\28\u00dc\3\2\2\2:\u00e6\3\2\2\2<\u00f0"+
		"\3\2\2\2>\u00f3\3\2\2\2@\u00fb\3\2\2\2B\u0100\3\2\2\2D\u0105\3\2\2\2F"+
		"\u0108\3\2\2\2H\u0119\3\2\2\2J\u011c\3\2\2\2L\u0120\3\2\2\2N\u0128\3\2"+
		"\2\2P\u012c\3\2\2\2R\u012e\3\2\2\2T\u0137\3\2\2\2VX\5\6\4\2WV\3\2\2\2"+
		"WX\3\2\2\2XZ\3\2\2\2Y[\5\n\6\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\5\4\3"+
		"\2]\3\3\2\2\2^a\5\f\7\2_a\5\66\34\2`^\3\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3"+
		"\2\2\2bc\3\2\2\2c\5\3\2\2\2db\3\2\2\2eg\5\b\5\2fe\3\2\2\2gh\3\2\2\2hf"+
		"\3\2\2\2hi\3\2\2\2i\7\3\2\2\2jk\7\r\2\2kl\5R*\2l\t\3\2\2\2mn\7\3\2\2n"+
		"o\79\2\2op\5T+\2pq\7:\2\2q\13\3\2\2\2ru\5\24\13\2su\5\16\b\2tr\3\2\2\2"+
		"ts\3\2\2\2u\r\3\2\2\2vw\7\7\2\2wx\79\2\2xy\5\20\t\2yz\7:\2\2z\17\3\2\2"+
		"\2{~\5\22\n\2|~\5*\26\2}{\3\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\21\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5"+
		".\30\2\u0083\u0084\5\"\22\2\u0084\23\3\2\2\2\u0085\u0088\5\30\r\2\u0086"+
		"\u0088\5\26\f\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\25\3\2\2"+
		"\2\u0089\u008a\7\7\2\2\u008a\u008b\5*\26\2\u008b\27\3\2\2\2\u008c\u008d"+
		"\7\7\2\2\u008d\u008f\5.\30\2\u008e\u0090\7D\2\2\u008f\u008e\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\5\"\22\2\u0092\31\3\2\2"+
		"\2\u0093\u0097\5 \21\2\u0094\u0097\5\34\17\2\u0095\u0097\5*\26\2\u0096"+
		"\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\33\3\2\2"+
		"\2\u0098\u0099\5\60\31\2\u0099\u009b\5\36\20\2\u009a\u009c\5\64\33\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\35\3\2\2\2\u009d\u00a2\5\"\22"+
		"\2\u009e\u00a2\5$\23\2\u009f\u00a2\5&\24\2\u00a0\u00a2\5(\25\2\u00a1\u009d"+
		"\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\37\3\2\2\2\u00a3\u00a5\7B\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5\62\32\2\u00a7!\3\2\2\2\u00a8\u00ae"+
		"\7#\2\2\u00a9\u00ae\5\62\32\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac\7;\2\2\u00ac"+
		"\u00ae\7<\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2"+
		"\2\2\u00ae#\3\2\2\2\u00af\u00b0\7B\2\2\u00b0\u00b1\5\"\22\2\u00b1%\3\2"+
		"\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\7=\2\2\u00b4\u00b5\7#\2\2\u00b5\u00b6"+
		"\7>\2\2\u00b6\u00b7\5,\27\2\u00b7\'\3\2\2\2\u00b8\u00b9\7=\2\2\u00b9\u00bb"+
		"\7>\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\5,\27\2\u00bf)\3\2\2\2"+
		"\u00c0\u00c1\5.\30\2\u00c1\u00c2\7\5\2\2\u00c2\u00c6\7;\2\2\u00c3\u00c5"+
		"\5\32\16\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca"+
		"\7<\2\2\u00ca+\3\2\2\2\u00cb\u00ce\5\"\22\2\u00cc\u00ce\5$\23\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce-\3\2\2\2\u00cf\u00d0\7H\2\2\u00d0"+
		"/\3\2\2\2\u00d1\u00d2\7H\2\2\u00d2\61\3\2\2\2\u00d3\u00d4\7H\2\2\u00d4"+
		"\63\3\2\2\2\u00d5\u00d6\7K\2\2\u00d6\65\3\2\2\2\u00d7\u00d9\58\35\2\u00d8"+
		"\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\5:"+
		"\36\2\u00db\67\3\2\2\2\u00dc\u00dd\7\b\2\2\u00dd\u00e1\79\2\2\u00de\u00e0"+
		"\5J&\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7:"+
		"\2\2\u00e59\3\2\2\2\u00e6\u00e7\7\13\2\2\u00e7\u00e8\5<\37\2\u00e8\u00ea"+
		"\7;\2\2\u00e9\u00eb\5> \2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7<"+
		"\2\2\u00ef;\3\2\2\2\u00f0\u00f1\7H\2\2\u00f1=\3\2\2\2\u00f2\u00f4\5@!"+
		"\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f8"+
		"\5B\"\2\u00f6\u00f8\5D#\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\5F$\2\u00fa?\3\2\2\2\u00fb\u00fc\7\t\2\2\u00fc"+
		"\u00fd\79\2\2\u00fd\u00fe\5T+\2\u00fe\u00ff\7:\2\2\u00ffA\3\2\2\2\u0100"+
		"\u0101\7\b\2\2\u0101\u0102\79\2\2\u0102\u0103\5L\'\2\u0103\u0104\7:\2"+
		"\2\u0104C\3\2\2\2\u0105\u0106\7\n\2\2\u0106\u0107\5P)\2\u0107E\3\2\2\2"+
		"\u0108\u0109\5H%\2\u0109\u010b\79\2\2\u010a\u010c\5\62\32\2\u010b\u010a"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0114\7:\2\2\u010e"+
		"\u010f\7\f\2\2\u010f\u0111\79\2\2\u0110\u0112\5\62\32\2\u0111\u0110\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\7:\2\2\u0114"+
		"\u010e\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0118\7@"+
		"\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118G\3\2\2\2\u0119\u011a"+
		"\7\31\2\2\u011a\u011b\78\2\2\u011bI\3\2\2\2\u011c\u011d\7\16\2\2\u011d"+
		"\u011e\7E\2\2\u011e\u011f\5N(\2\u011fK\3\2\2\2\u0120\u0121\7\16\2\2\u0121"+
		"\u0122\7E\2\2\u0122\u0123\5P)\2\u0123M\3\2\2\2\u0124\u0126\7H\2\2\u0125"+
		"\u0127\7A\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2"+
		"\2\2\u0128\u0124\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012bO\3\2\2\2\u012c\u012d\7H\2\2\u012dQ\3\2\2\2\u012e"+
		"\u012f\7J\2\2\u012fS\3\2\2\2\u0130\u0131\7\16\2\2\u0131\u0133\7E\2\2\u0132"+
		"\u0134\7J\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2"+
		"\2\2\u0135\u0130\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138U\3\2\2\2\u0139\u0137\3\2\2\2!WZ`bht}\177\u0087\u008f"+
		"\u0096\u009b\u00a1\u00a4\u00ad\u00bc\u00c6\u00cd\u00d8\u00e1\u00ec\u00f3"+
		"\u00f7\u010b\u0111\u0114\u0117\u0126\u012a\u0133\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}