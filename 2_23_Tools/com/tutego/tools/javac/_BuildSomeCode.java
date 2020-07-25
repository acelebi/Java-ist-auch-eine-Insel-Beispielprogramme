package com.tutego.tools.javac;

import javax.tools.*;
import com.sun.tools.javac.code.*;
import com.sun.tools.javac.tree.*;
import com.sun.tools.javac.tree.JCTree.JCAnnotation;
import com.sun.tools.javac.tree.JCTree.JCBlock;
import com.sun.tools.javac.tree.JCTree.JCClassDecl;
import com.sun.tools.javac.tree.JCTree.JCCompilationUnit;
import com.sun.tools.javac.tree.JCTree.JCExpression;
import com.sun.tools.javac.tree.JCTree.JCIdent;
import com.sun.tools.javac.tree.JCTree.JCStatement;
import com.sun.tools.javac.tree.JCTree.JCTypeParameter;
import com.sun.tools.javac.tree.JCTree.JCVariableDecl;
import com.sun.tools.javac.util.*;

public class _BuildSomeCode {
  public static void main( String[] args ) {
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    StandardJavaFileManager fm = compiler.getStandardFileManager( null, null, null );
    Context context = new Context();
    context.put( JavaFileManager.class, fm );

    Names names = Names.instance( context );
    TreeMaker maker = TreeMaker.instance( context );

    JCIdent stringType = maker.Ident( names.fromString( "String" ) );
    JCVariableDecl mainParam = maker.VarDef( maker.Modifiers( Flags.PARAMETER ),
                                             names.fromString( "args" ),
                                             maker.TypeArray( stringType ),
                                             null );
    ListBuffer<JCVariableDecl> mainParams = new ListBuffer<>();
    mainParams.append( mainParam );

    JCExpression exp = maker.Ident( names.fromString( "System" ) );
    exp = maker.Select( exp, names.fromString( "out" ) );
    exp = maker.Select( exp, names.fromString( "println" ) );

    ListBuffer<JCExpression> printlnArgs = new ListBuffer<>();
    printlnArgs.append( maker.Literal( TypeTag.CLASS, "Hallo Welt!" ) );
    JCExpression methodCall = maker.Apply( List.<JCExpression> nil(),
                                           exp,
                                           printlnArgs.toList() );

    ListBuffer<JCStatement> stmts = new ListBuffer<>();
    stmts.append( maker.Exec( methodCall ) );
    JCBlock methodBody = maker.Block( 0, stmts.toList() );

    ListBuffer<JCTree> methods = new ListBuffer<>();
    methods.append( maker.MethodDef( maker.Modifiers( Flags.PUBLIC | Flags.STATIC ),
                                     names.fromString( "main" ),
                                     maker.TypeIdent( TypeTag.VOID ),
                                     List.<JCTypeParameter> nil(),
                                     mainParams.toList(),
                                     List.<JCExpression> nil(),
                                     methodBody,
                                     null ) );

    JCClassDecl classDef = maker.ClassDef( maker.Modifiers( Flags.PUBLIC ),
                                           names.fromString( "GeneratedClass" ),
                                           List.<JCTypeParameter> nil(),
                                           null,
                                           List.<JCExpression> nil(),
                                           methods.toList() );

    ListBuffer<JCTree> classDefs = new ListBuffer<>();
    classDefs.append( classDef );

    JCCompilationUnit compilationUnit = maker.TopLevel( List.<JCAnnotation> nil(), null, classDefs.toList() );
    
    System.out.println( compilationUnit );
  }
}