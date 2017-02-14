
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
/**
 */
package org.openecomp.ncomp.sirius.manager.tableTemplate;

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-sirius-manager-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.sirius.manager'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore GenModel='http://www.eclipse.org/emf/2002/GenModel' doc='http://openecomp.org/sirius/doc'"
 * @generated
 */
public interface TableTemplatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tableTemplate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.sirius.manager.tableTemplate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tableTemplate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TableTemplatePackage eINSTANCE = org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.AbstractTableTemplateImpl <em>Abstract Table Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.AbstractTableTemplateImpl
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getAbstractTableTemplate()
	 * @generated
	 */
	int ABSTRACT_TABLE_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE_TEMPLATE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE_TEMPLATE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE_TEMPLATE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE_TEMPLATE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Tree Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE_TEMPLATE__TREE_PATH = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE_TEMPLATE__TABLE_PATH = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Table Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE_TEMPLATE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Table Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE_TEMPLATE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.HasColumnsTableTemplateImpl <em>Has Columns Table Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.HasColumnsTableTemplateImpl
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getHasColumnsTableTemplate()
	 * @generated
	 */
	int HAS_COLUMNS_TABLE_TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COLUMNS_TABLE_TEMPLATE__COLUMNS = 0;

	/**
	 * The number of structural features of the '<em>Has Columns Table Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COLUMNS_TABLE_TEMPLATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Columns Table Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_COLUMNS_TABLE_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.LogTableTemplateImpl <em>Log Table Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.LogTableTemplateImpl
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getLogTableTemplate()
	 * @generated
	 */
	int LOG_TABLE_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TABLE_TEMPLATE__NAME = ABSTRACT_TABLE_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TABLE_TEMPLATE__LAST_POLLED = ABSTRACT_TABLE_TEMPLATE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TABLE_TEMPLATE__LAST_CHANGED = ABSTRACT_TABLE_TEMPLATE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TABLE_TEMPLATE__CREATED = ABSTRACT_TABLE_TEMPLATE__CREATED;

	/**
	 * The feature id for the '<em><b>Tree Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TABLE_TEMPLATE__TREE_PATH = ABSTRACT_TABLE_TEMPLATE__TREE_PATH;

	/**
	 * The feature id for the '<em><b>Table Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TABLE_TEMPLATE__TABLE_PATH = ABSTRACT_TABLE_TEMPLATE__TABLE_PATH;

	/**
	 * The feature id for the '<em><b>Min Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TABLE_TEMPLATE__MIN_LEVEL = ABSTRACT_TABLE_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TABLE_TEMPLATE__MIN_SEVERITY = ABSTRACT_TABLE_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix Resource Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TABLE_TEMPLATE__PREFIX_RESOURCE_PATH = ABSTRACT_TABLE_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TABLE_TEMPLATE__DURATION = ABSTRACT_TABLE_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aggregation Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TABLE_TEMPLATE__AGGREGATION_DURATION = ABSTRACT_TABLE_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Log Table Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TABLE_TEMPLATE_FEATURE_COUNT = ABSTRACT_TABLE_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Log Table Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_TABLE_TEMPLATE_OPERATION_COUNT = ABSTRACT_TABLE_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateImpl <em>Table Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateImpl
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getTableTemplate()
	 * @generated
	 */
	int TABLE_TEMPLATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE__NAME = ABSTRACT_TABLE_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE__LAST_POLLED = ABSTRACT_TABLE_TEMPLATE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE__LAST_CHANGED = ABSTRACT_TABLE_TEMPLATE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE__CREATED = ABSTRACT_TABLE_TEMPLATE__CREATED;

	/**
	 * The feature id for the '<em><b>Tree Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE__TREE_PATH = ABSTRACT_TABLE_TEMPLATE__TREE_PATH;

	/**
	 * The feature id for the '<em><b>Table Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE__TABLE_PATH = ABSTRACT_TABLE_TEMPLATE__TABLE_PATH;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE__COLUMNS = ABSTRACT_TABLE_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Row Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE__ROW_PATH = ABSTRACT_TABLE_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_FEATURE_COUNT = ABSTRACT_TABLE_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_OPERATION_COUNT = ABSTRACT_TABLE_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.IteratorTableTemplateImpl <em>Iterator Table Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.IteratorTableTemplateImpl
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getIteratorTableTemplate()
	 * @generated
	 */
	int ITERATOR_TABLE_TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_TABLE_TEMPLATE__NAME = ABSTRACT_TABLE_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_TABLE_TEMPLATE__LAST_POLLED = ABSTRACT_TABLE_TEMPLATE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_TABLE_TEMPLATE__LAST_CHANGED = ABSTRACT_TABLE_TEMPLATE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_TABLE_TEMPLATE__CREATED = ABSTRACT_TABLE_TEMPLATE__CREATED;

	/**
	 * The feature id for the '<em><b>Tree Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_TABLE_TEMPLATE__TREE_PATH = ABSTRACT_TABLE_TEMPLATE__TREE_PATH;

	/**
	 * The feature id for the '<em><b>Table Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_TABLE_TEMPLATE__TABLE_PATH = ABSTRACT_TABLE_TEMPLATE__TABLE_PATH;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_TABLE_TEMPLATE__COLUMNS = ABSTRACT_TABLE_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_TABLE_TEMPLATE__ITERATOR = ABSTRACT_TABLE_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iterator Table Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_TABLE_TEMPLATE_FEATURE_COUNT = ABSTRACT_TABLE_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Iterator Table Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_TABLE_TEMPLATE_OPERATION_COUNT = ABSTRACT_TABLE_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TimeTableTemplateImpl <em>Time Table Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TimeTableTemplateImpl
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getTimeTableTemplate()
	 * @generated
	 */
	int TIME_TABLE_TEMPLATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_TEMPLATE__NAME = TABLE_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_TEMPLATE__LAST_POLLED = TABLE_TEMPLATE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_TEMPLATE__LAST_CHANGED = TABLE_TEMPLATE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_TEMPLATE__CREATED = TABLE_TEMPLATE__CREATED;

	/**
	 * The feature id for the '<em><b>Tree Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_TEMPLATE__TREE_PATH = TABLE_TEMPLATE__TREE_PATH;

	/**
	 * The feature id for the '<em><b>Table Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_TEMPLATE__TABLE_PATH = TABLE_TEMPLATE__TABLE_PATH;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_TEMPLATE__COLUMNS = TABLE_TEMPLATE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Row Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_TEMPLATE__ROW_PATH = TABLE_TEMPLATE__ROW_PATH;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_TEMPLATE__DURATION = TABLE_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Table Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_TEMPLATE_FEATURE_COUNT = TABLE_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Table Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TABLE_TEMPLATE_OPERATION_COUNT = TABLE_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateColumnImpl
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getTableTemplateColumn()
	 * @generated
	 */
	int TABLE_TEMPLATE_COLUMN = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_COLUMN__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_COLUMN__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_COLUMN__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_COLUMN__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_COLUMN_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_COLUMN_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateAttributeColumnImpl <em>Attribute Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateAttributeColumnImpl
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getTableTemplateAttributeColumn()
	 * @generated
	 */
	int TABLE_TEMPLATE_ATTRIBUTE_COLUMN = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_ATTRIBUTE_COLUMN__NAME = TABLE_TEMPLATE_COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_ATTRIBUTE_COLUMN__LAST_POLLED = TABLE_TEMPLATE_COLUMN__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_ATTRIBUTE_COLUMN__LAST_CHANGED = TABLE_TEMPLATE_COLUMN__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_ATTRIBUTE_COLUMN__CREATED = TABLE_TEMPLATE_COLUMN__CREATED;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_ATTRIBUTE_COLUMN__PATH = TABLE_TEMPLATE_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_ATTRIBUTE_COLUMN_FEATURE_COUNT = TABLE_TEMPLATE_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_ATTRIBUTE_COLUMN_OPERATION_COUNT = TABLE_TEMPLATE_COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateMetricColumnImpl <em>Metric Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateMetricColumnImpl
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getTableTemplateMetricColumn()
	 * @generated
	 */
	int TABLE_TEMPLATE_METRIC_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_METRIC_COLUMN__NAME = TABLE_TEMPLATE_COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_METRIC_COLUMN__LAST_POLLED = TABLE_TEMPLATE_COLUMN__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_METRIC_COLUMN__LAST_CHANGED = TABLE_TEMPLATE_COLUMN__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_METRIC_COLUMN__CREATED = TABLE_TEMPLATE_COLUMN__CREATED;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_METRIC_COLUMN__PATH = TABLE_TEMPLATE_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_METRIC_COLUMN__OPTION = TABLE_TEMPLATE_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Metric Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_METRIC_COLUMN_FEATURE_COUNT = TABLE_TEMPLATE_COLUMN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Metric Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TEMPLATE_METRIC_COLUMN_OPERATION_COUNT = TABLE_TEMPLATE_COLUMN_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate <em>Abstract Table Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Table Template</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate
	 * @generated
	 */
	EClass getAbstractTableTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate#getTreePath <em>Tree Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Path</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate#getTreePath()
	 * @see #getAbstractTableTemplate()
	 * @generated
	 */
	EAttribute getAbstractTableTemplate_TreePath();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate#getTablePath <em>Table Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Path</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate#getTablePath()
	 * @see #getAbstractTableTemplate()
	 * @generated
	 */
	EAttribute getAbstractTableTemplate_TablePath();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.HasColumnsTableTemplate <em>Has Columns Table Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Columns Table Template</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.HasColumnsTableTemplate
	 * @generated
	 */
	EClass getHasColumnsTableTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.HasColumnsTableTemplate#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.HasColumnsTableTemplate#getColumns()
	 * @see #getHasColumnsTableTemplate()
	 * @generated
	 */
	EReference getHasColumnsTableTemplate_Columns();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate <em>Log Table Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Table Template</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate
	 * @generated
	 */
	EClass getLogTableTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getMinLevel <em>Min Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Level</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getMinLevel()
	 * @see #getLogTableTemplate()
	 * @generated
	 */
	EAttribute getLogTableTemplate_MinLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getMinSeverity <em>Min Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Severity</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getMinSeverity()
	 * @see #getLogTableTemplate()
	 * @generated
	 */
	EAttribute getLogTableTemplate_MinSeverity();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getPrefixResourcePath <em>Prefix Resource Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix Resource Path</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getPrefixResourcePath()
	 * @see #getLogTableTemplate()
	 * @generated
	 */
	EAttribute getLogTableTemplate_PrefixResourcePath();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getDuration()
	 * @see #getLogTableTemplate()
	 * @generated
	 */
	EAttribute getLogTableTemplate_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getAggregationDuration <em>Aggregation Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation Duration</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getAggregationDuration()
	 * @see #getLogTableTemplate()
	 * @generated
	 */
	EAttribute getLogTableTemplate_AggregationDuration();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplate <em>Table Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Template</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplate
	 * @generated
	 */
	EClass getTableTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplate#getRowPath <em>Row Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Path</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplate#getRowPath()
	 * @see #getTableTemplate()
	 * @generated
	 */
	EAttribute getTableTemplate_RowPath();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.IteratorTableTemplate <em>Iterator Table Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Table Template</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.IteratorTableTemplate
	 * @generated
	 */
	EClass getIteratorTableTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.IteratorTableTemplate#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterator</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.IteratorTableTemplate#getIterator()
	 * @see #getIteratorTableTemplate()
	 * @generated
	 */
	EReference getIteratorTableTemplate_Iterator();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TimeTableTemplate <em>Time Table Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Table Template</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TimeTableTemplate
	 * @generated
	 */
	EClass getTimeTableTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TimeTableTemplate#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TimeTableTemplate#getDuration()
	 * @see #getTimeTableTemplate()
	 * @generated
	 */
	EAttribute getTimeTableTemplate_Duration();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateColumn
	 * @generated
	 */
	EClass getTableTemplateColumn();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateAttributeColumn <em>Attribute Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Column</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateAttributeColumn
	 * @generated
	 */
	EClass getTableTemplateAttributeColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateAttributeColumn#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateAttributeColumn#getPath()
	 * @see #getTableTemplateAttributeColumn()
	 * @generated
	 */
	EAttribute getTableTemplateAttributeColumn_Path();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn <em>Metric Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Column</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn
	 * @generated
	 */
	EClass getTableTemplateMetricColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn#getPath()
	 * @see #getTableTemplateMetricColumn()
	 * @generated
	 */
	EAttribute getTableTemplateMetricColumn_Path();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn#getOption()
	 * @see #getTableTemplateMetricColumn()
	 * @generated
	 */
	EReference getTableTemplateMetricColumn_Option();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TableTemplateFactory getTableTemplateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.AbstractTableTemplateImpl <em>Abstract Table Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.AbstractTableTemplateImpl
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getAbstractTableTemplate()
		 * @generated
		 */
		EClass ABSTRACT_TABLE_TEMPLATE = eINSTANCE.getAbstractTableTemplate();

		/**
		 * The meta object literal for the '<em><b>Tree Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TABLE_TEMPLATE__TREE_PATH = eINSTANCE.getAbstractTableTemplate_TreePath();

		/**
		 * The meta object literal for the '<em><b>Table Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TABLE_TEMPLATE__TABLE_PATH = eINSTANCE.getAbstractTableTemplate_TablePath();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.HasColumnsTableTemplateImpl <em>Has Columns Table Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.HasColumnsTableTemplateImpl
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getHasColumnsTableTemplate()
		 * @generated
		 */
		EClass HAS_COLUMNS_TABLE_TEMPLATE = eINSTANCE.getHasColumnsTableTemplate();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_COLUMNS_TABLE_TEMPLATE__COLUMNS = eINSTANCE.getHasColumnsTableTemplate_Columns();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.LogTableTemplateImpl <em>Log Table Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.LogTableTemplateImpl
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getLogTableTemplate()
		 * @generated
		 */
		EClass LOG_TABLE_TEMPLATE = eINSTANCE.getLogTableTemplate();

		/**
		 * The meta object literal for the '<em><b>Min Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_TABLE_TEMPLATE__MIN_LEVEL = eINSTANCE.getLogTableTemplate_MinLevel();

		/**
		 * The meta object literal for the '<em><b>Min Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_TABLE_TEMPLATE__MIN_SEVERITY = eINSTANCE.getLogTableTemplate_MinSeverity();

		/**
		 * The meta object literal for the '<em><b>Prefix Resource Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_TABLE_TEMPLATE__PREFIX_RESOURCE_PATH = eINSTANCE.getLogTableTemplate_PrefixResourcePath();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_TABLE_TEMPLATE__DURATION = eINSTANCE.getLogTableTemplate_Duration();

		/**
		 * The meta object literal for the '<em><b>Aggregation Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOG_TABLE_TEMPLATE__AGGREGATION_DURATION = eINSTANCE.getLogTableTemplate_AggregationDuration();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateImpl <em>Table Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateImpl
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getTableTemplate()
		 * @generated
		 */
		EClass TABLE_TEMPLATE = eINSTANCE.getTableTemplate();

		/**
		 * The meta object literal for the '<em><b>Row Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TEMPLATE__ROW_PATH = eINSTANCE.getTableTemplate_RowPath();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.IteratorTableTemplateImpl <em>Iterator Table Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.IteratorTableTemplateImpl
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getIteratorTableTemplate()
		 * @generated
		 */
		EClass ITERATOR_TABLE_TEMPLATE = eINSTANCE.getIteratorTableTemplate();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_TABLE_TEMPLATE__ITERATOR = eINSTANCE.getIteratorTableTemplate_Iterator();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TimeTableTemplateImpl <em>Time Table Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TimeTableTemplateImpl
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getTimeTableTemplate()
		 * @generated
		 */
		EClass TIME_TABLE_TEMPLATE = eINSTANCE.getTimeTableTemplate();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TABLE_TEMPLATE__DURATION = eINSTANCE.getTimeTableTemplate_Duration();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateColumnImpl
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getTableTemplateColumn()
		 * @generated
		 */
		EClass TABLE_TEMPLATE_COLUMN = eINSTANCE.getTableTemplateColumn();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateAttributeColumnImpl <em>Attribute Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateAttributeColumnImpl
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getTableTemplateAttributeColumn()
		 * @generated
		 */
		EClass TABLE_TEMPLATE_ATTRIBUTE_COLUMN = eINSTANCE.getTableTemplateAttributeColumn();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TEMPLATE_ATTRIBUTE_COLUMN__PATH = eINSTANCE.getTableTemplateAttributeColumn_Path();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateMetricColumnImpl <em>Metric Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateMetricColumnImpl
		 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplatePackageImpl#getTableTemplateMetricColumn()
		 * @generated
		 */
		EClass TABLE_TEMPLATE_METRIC_COLUMN = eINSTANCE.getTableTemplateMetricColumn();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TEMPLATE_METRIC_COLUMN__PATH = eINSTANCE.getTableTemplateMetricColumn_Path();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TEMPLATE_METRIC_COLUMN__OPTION = eINSTANCE.getTableTemplateMetricColumn_Option();

	}

} //TableTemplatePackage
