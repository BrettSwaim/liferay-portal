/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

import React from 'react';
import PropTypes from 'prop-types';

const SegmentsExperimentsContext = React.createContext({
	page: {
		classNameId: '',
		classPK: '',
		type: ''
	},
	segmentsExperimentsUtil: {
		createExperiment: () => {},
		createVariant: () => {},
		deleteVariant: () => {},
		editExperiment: () => {},
		editVariant: () => {}
	}
});

SegmentsExperimentsContext.Provider.propTypes = {
	page: PropTypes.shape({
		classNameId: PropTypes.string.isRequired,
		classPK: PropTypes.string.isRequired,
		type: PropTypes.string.isRequired
	}),
	segmentsExperimentsUtil: PropTypes.shape({
		createExperiment: PropTypes.func.isRequired,
		createVariant: PropTypes.func.isRequired,
		deleteVariant: PropTypes.func.isRequired,
		editExperiment: PropTypes.func.isRequired,
		editVariant: PropTypes.func.isRequired
	})
};

export default SegmentsExperimentsContext;
